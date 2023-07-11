SUMMARY = "Checker Qual"
DESCRIPTION = "Checker Qual contains annotations (type qualifiers) that a programmer \
writes to specify Java code for type-checking by the Checker Framework."
LICENSE = "MIT"

PV = "3.22.0"

RPM_NAME = "checker-qual-3.22.0-1.5.noarch.rpm"
RPM_HASH = "10d4982a91781f49d4b69740c3bec5e15f2186e1a59f9c0262d163b0ade25063e0e9350fc983a51996fed26c5f8c13cd0714702b37fa5cd37fb21d014bf47128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checker-qual \
mvn-org.checkerframework-checker-qual \
mvn-org.checkerframework-checker-qual-pom- \
osgi-checker-qual"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
