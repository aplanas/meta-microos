SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.18.0"

RPM_NAME = "pluto-5.18.0-1.1.aarch64.rpm"
RPM_HASH = "150d95c2d7927093c5774047ede8a1dff610f8b3aabe6ff1843695886e1707b244df3572b00f87321e9a96e3aff36ca341af2219c2471505722d5fc4819c44f1"

RPROVIDES:${PN} += "pluto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
