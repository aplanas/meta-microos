SUMMARY = "Namespace aware SAX parser utility library"
DESCRIPTION = "Pentaho LibXML is a namespace aware SAX parser utility library. It \
facilitates implementing non-trivial SAX input handlers."
LICENSE = "LGPL-2.0-only"

PV = "1.1.3"

RPM_NAME = "pentaho-libxml-1.1.3-6.7.noarch.rpm"
RPM_HASH = "eea95e8274e3665092fb617a229890e9e0e23a2d7c929181d11227b28ce2b0f79f33589dffb222877e3c3bfd1f7be4d551e362d2c17fff4d2e9d93994f6a9ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase \
libloader"

inherit rpm
