SUMMARY = "Clean up Kubernetes yaml and json output to make it readable"
DESCRIPTION = "Remove clutter from Kubernetes manifests to make them more readable."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "kubectl-neat-2.0.3-1.10.aarch64.rpm"
RPM_HASH = "9ca0c1f1d1a07aacd0052fcc5aaca25d441db71913c18877a9f03ff7f70d1113768d9ff64c3d30e105e16ced2fb646492e2bc3418dd41d3b28dfe5a4870a7196"

RPROVIDES:${PN} += "kubectl-neat"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
