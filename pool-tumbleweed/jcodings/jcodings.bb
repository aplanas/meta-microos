SUMMARY = "Java-based codings helper classes for Joni and JRuby"
DESCRIPTION = "jcodings: java-based codings helper classes for Joni and JRuby."
LICENSE = "MIT"

PV = "1.0.12"

RPM_NAME = "jcodings-1.0.12-3.7.noarch.rpm"
RPM_HASH = "6441f30dd41711770c7d1fc2d240699bdfb0fe26d4676f75d291232526a5d81aac8636d5dc95fdf47c1ef9c3fc4214fa654135b18b8b0de67cb5c2ac4aa61b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcodings"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
