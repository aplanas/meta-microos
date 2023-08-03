SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.18.2"

RPM_NAME = "pluto-5.18.2-1.1.aarch64.rpm"
RPM_HASH = "ff787062fa5457bdb907e81fb0fbcb265fc1934f0eeb710ba0b0fb3823113990422da76a825bf7b04cbf0925e5a883bc3146a24124fa84c9b973a6ab3fd5cc8d"

RPROVIDES:${PN} += "pluto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
