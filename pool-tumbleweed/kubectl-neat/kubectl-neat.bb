SUMMARY = "Clean up Kubernetes yaml and json output to make it readable"
DESCRIPTION = "Remove clutter from Kubernetes manifests to make them more readable."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "kubectl-neat-2.0.3-1.9.aarch64.rpm"
RPM_HASH = "6b0a7a4a2dbd220df8549bce08d08e6b6b24fdf41a508f67f97f4310db6b7b13df9701899b4be4f596d0a1a136653be35cdb3848f3aef7ce3aee1997a96885c1"

RPROVIDES:${PN} += "kubectl-neat \
kubectl-neat(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
