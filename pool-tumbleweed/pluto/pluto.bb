SUMMARY = "A cli tool to help discover deprecated apiVersions in Kubernetes"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases."
LICENSE = "Apache-2.0"

PV = "5.18.4"

RPM_NAME = "pluto-5.18.4-1.1.aarch64.rpm"
RPM_HASH = "da8ec6dbfb876ecf008a00f585cd6d6bca3a11b542bcf8d5fb6f51164b6721cf5129f7cc9e685f66529add93578bb910d4ca46a9e9957be99bf037d06049e795"

RPROVIDES:${PN} += "pluto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
