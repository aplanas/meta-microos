SUMMARY = "Collection of parsers for Java"
DESCRIPTION = "uniVocity-parsers is a suite of parsers for Java. It provides an \
interface for handling different file formats, and a framework for \
the development of new parsers."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "univocity-parsers-2.9.1-1.5.noarch.rpm"
RPM_HASH = "6405cab95b5a68c42c426c3e2495e0fe214f692585a00252c571f5849c2a0d22a0f0d3c884f7e3cac6e1550337553869836114bd8fc5c2eb6ee53eb9d0cecc27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.univocity-univocity-parsers \
mvn-com.univocity-univocity-parsers-pom- \
osgi-com.univocity.parsers \
univocity-parsers"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
