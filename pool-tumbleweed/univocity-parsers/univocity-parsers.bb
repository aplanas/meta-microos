SUMMARY = "Collection of parsers for Java"
DESCRIPTION = "uniVocity-parsers is a suite of parsers for Java. It provides an \
interface for handling different file formats, and a framework for \
the development of new parsers."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "univocity-parsers-2.9.1-1.4.noarch.rpm"
RPM_HASH = "2a2e2713041dd4ce2a6cc99741c7259613cc480ef2443fc1560000cd87b58633c2c5d75cbc0d86f8befc62cb3b4560afb5535060a6b7bbc53ba3fd1251fe88e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.univocity-univocity-parsers \
mvn-com.univocity-univocity-parsers-pom- \
osgi-com.univocity.parsers \
univocity-parsers"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
