SUMMARY = "API documentation for maven-dependency-analyzer"
DESCRIPTION = "API documentation for maven-dependency-analyzer"
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "maven-dependency-analyzer-javadoc-1.10-3.12.noarch.rpm"
RPM_HASH = "445a0abe00a31b6849707588cbf60c012549412f7a34aa29c3c4fde8789eab5b15048e783f36fc8f24b3fb73520738bc13347ec14d72e394189149573fd40542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-analyzer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
