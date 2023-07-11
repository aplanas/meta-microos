SUMMARY = "CLI and kubectl plugin for Kyverno"
DESCRIPTION = "Kyverno is a policy engine designed for Kubernetes. It can validate, mutate, and generate configurations using admission controls and background scans. Kyverno policies are Kubernetes resources and do not require learning a new language. Kyverno is designed to work nicely with tools you already use like kubectl, kustomize, and Git."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kyverno-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "88df1de1afa6f76961431a375fce6e0371cd71174d97133336a837241b4f03db44c4b89ffb4ea39fa1c29802324421262e4f263b67c86fdf5153ff70c35dd236"

RPROVIDES:${PN} += "kyverno"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
