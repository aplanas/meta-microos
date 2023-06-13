SUMMARY = "Bill of materials POM for Jackson projects"
DESCRIPTION = "A 'bill of materials' POM for Jackson dependencies."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-bom-2.13.3-1.3.noarch.rpm"
RPM_HASH = "f1fd5d6ac44ca408a1da902cc000442d31a6f6748c40c7ade21d2ae6c74fa620dc3f438c5fa3587149e008db9f176c6e94fd957f241e197eded3cb31bb884b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-bom \
mvn(com.fasterxml.jackson:jackson-base:pom:) \
mvn(com.fasterxml.jackson:jackson-bom:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson:jackson-parent:pom:)"

inherit rpm
