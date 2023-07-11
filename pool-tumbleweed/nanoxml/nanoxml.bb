SUMMARY = "Small non-validating XML parser for Java"
DESCRIPTION = "NanoXML is a small non-validating parser for Java. \
The full parser with builder fits in a JAR file of about 32K."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-2.2.3-4.7.noarch.rpm"
RPM_HASH = "f618692230a780cc5e64473a2ccdc16b6053e474c95a850d79c1568f27ddd51acf6d190cabe62db17bb7cbd8b57e06b767a98a22675f097d661694de1106ba79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml"

RDEPENDS:${PN} += "java"

inherit rpm
