SUMMARY = "Security risk analysis for Kubernetes resources"
DESCRIPTION = "Security risk analysis for Kubernetes resources"
LICENSE = "Apache-2.0"

PV = "2.13.0"

RPM_NAME = "kubesec-2.13.0-1.1.aarch64.rpm"
RPM_HASH = "ccdd9b303f8da6e1accb293a80e794668004f8cd2d50d9d86d9fb82650eb7b0a361e81818bf5a2518ddec4809949be61e393a02a080aba985c12103c7758ec2a"

RPROVIDES:${PN} += "kubesec"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
