SUMMARY = "Namespace aware SAX parser utility library"
DESCRIPTION = "Pentaho LibXML is a namespace aware SAX parser utility library. It \
facilitates implementing non-trivial SAX input handlers."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "pentaho-libxml-1.1.6-1.1.noarch.rpm"
RPM_HASH = "420aa3b153cd500c043057ffe863f8d3565497a97c6638db6a490786ef5c63be422ffcef75c614ebda5961e3d667cbb47d80243ee51386eb19eb70acadca3095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase \
libloader"

inherit rpm
