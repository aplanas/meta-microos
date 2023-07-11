SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-common-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "e26078a8524e7835b4b8cdd034710f22bb8e82b95cbdb63074d04abf8b1326ea2db26c9c5be82133e8856add77089d351b9aef75a0a559f407be8236c1c87013"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.21-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.21-client"

inherit rpm
