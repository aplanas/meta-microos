SUMMARY = "Development files for OpenShadingLanguage"
DESCRIPTION = "The OpenShadingLanguage-devel package contains libraries and header files for \
developing applications that use OpenShadingLanguage."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-devel-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "f3b342dc38a1f1296071cc489634aed2ae2848a84babcc30d1f76e97a64095db38cd5d4a46138a78eed94d882e53071de4eb8a812d28dacd09044a73bc4eef65"

RPROVIDES:${PN} += "OpenShadingLanguage-devel OpenShadingLanguage-devel(aarch-64) cmake(OSL) pkgconfig(oslcomp) pkgconfig(oslexec) pkgconfig(oslquery)"
RDEPENDS:${PN} += "/usr/bin/pkg-config OpenShadingLanguage liboslcomp1_12 liboslexec1_12 liboslnoise1_12 liboslquery1_12 libtestshade1_12"

inherit rpm
