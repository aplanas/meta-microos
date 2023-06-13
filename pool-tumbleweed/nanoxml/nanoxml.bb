SUMMARY = "Small non-validating XML parser for Java"
DESCRIPTION = "NanoXML is a small non-validating parser for Java. \
The full parser with builder fits in a JAR file of about 32K."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-2.2.3-4.6.noarch.rpm"
RPM_HASH = "d7f852bce95250c8757a4cb999b1ab6402f94d44c05b9b4b37942e3f3a263dc733e124d1886efb8b6777e48ab258d74180bea6b9c2d639907ee0a99adddf5dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml"

RDEPENDS:${PN} += "java"

inherit rpm
