SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-kubelet-common-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "a9b82cf8b36821a476d242627f99d9cfc41ab158dc434e325bee0adedb1f2f48cca156217f28aacbd1a183195ddeae5c344be340b31ecf1a12a8c213be2e7e3f"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.24-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.24"

inherit rpm
