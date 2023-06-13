SUMMARY = "Checker Qual"
DESCRIPTION = "Checker Qual contains annotations (type qualifiers) that a programmer \
writes to specify Java code for type-checking by the Checker Framework."
LICENSE = "MIT"

PV = "3.22.0"

RPM_NAME = "checker-qual-3.22.0-1.4.noarch.rpm"
RPM_HASH = "50a9a9a3629551aefa8645033c834e508628870d31fa8bb82327a0c132050d26f4651f430e9488803cd14689ece709ce3047ee6dedd8904560e1b5aa8ec9dc6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checker-qual \
mvn(org.checkerframework:checker-qual) \
mvn(org.checkerframework:checker-qual:pom:) \
osgi(checker-qual)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
