SUMMARY = "Java API for accessing the WordNet relational dictionary"
DESCRIPTION = "JWNL is a Java API for accessing the WordNet relational dictionary. \
WordNet is widely used for developing NLP applications, and a Java \
API such as JWNL will allow developers to more easily use Java for \
building NLP applications."
LICENSE = "BSD-3-Clause"

PV = "1.4~rc3"

RPM_NAME = "jwnl-1.4~rc3-2.11.noarch.rpm"
RPM_HASH = "67262a9c58d507a6b2eb30620aab4256c578d0abae7f360947422901aa39bbcc66534fe775c89d76f0a80a5a450247c6ecaa183e6c534695c24fd3ff87c67cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwnl \
mvn-jwnl-jwnl \
mvn-jwnl-jwnl-pom- \
mvn-net.sf.jwordnet-jwnl \
mvn-net.sf.jwordnet-jwnl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
