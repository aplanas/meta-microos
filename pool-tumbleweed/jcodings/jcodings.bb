SUMMARY = "Java-based codings helper classes for Joni and JRuby"
DESCRIPTION = "jcodings: java-based codings helper classes for Joni and JRuby."
LICENSE = "MIT"

PV = "1.0.12"

RPM_NAME = "jcodings-1.0.12-3.6.noarch.rpm"
RPM_HASH = "22cdb5c7fa946145271062084b23140d892602eb2f0d56514f92ff7fb84f33209ff7a2a8fd1688fb3c15b129ad29690bddd9a20b0cbac4ac01f680485eaf9617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcodings"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
