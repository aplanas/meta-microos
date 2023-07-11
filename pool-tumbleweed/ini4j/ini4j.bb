SUMMARY = "Java API for handling Windows ini file format"
DESCRIPTION = "The [ini4j] is a simple Java API for handling configuration files in \
Windows .ini format. Additionally, the library includes Java \
Preferences API implementation based on the .ini file."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "ini4j-0.5.1-28.10.noarch.rpm"
RPM_HASH = "5489ab7fb1e2206246d515502ce0519e872113a4f6268e42852b0f016c18d5ba9d408878544da97009fc0906281ec6c3135ab855c9798feee95dc71eba66f505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ini4j \
mvn-org.ini4j-ini4j \
mvn-org.ini4j-ini4j-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
