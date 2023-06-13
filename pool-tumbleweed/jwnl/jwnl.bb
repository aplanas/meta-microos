SUMMARY = "Java API for accessing the WordNet relational dictionary"
DESCRIPTION = "JWNL is a Java API for accessing the WordNet relational dictionary. \
WordNet is widely used for developing NLP applications, and a Java \
API such as JWNL will allow developers to more easily use Java for \
building NLP applications."
LICENSE = "BSD-3-Clause"

PV = "1.4~rc3"

RPM_NAME = "jwnl-1.4~rc3-2.10.noarch.rpm"
RPM_HASH = "449a780f9cde6723eedb70216c2ab189e976963f43cbb1b7491760b3ce5bdce8b0b61cabce9e4605d03dd03e4fd117aa14a93665a1d590228c851346ead1549e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwnl \
mvn(jwnl:jwnl) \
mvn(jwnl:jwnl:pom:) \
mvn(net.sf.jwordnet:jwnl) \
mvn(net.sf.jwordnet:jwnl:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-logging:commons-logging)"

inherit rpm
