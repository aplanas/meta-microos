SUMMARY = "Javadoc for maven-verifier"
DESCRIPTION = "API documentation for maven-verifier."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "maven-verifier-javadoc-1.6-4.1.noarch.rpm"
RPM_HASH = "d1403632fb841d4bcd61cb52b7348442ebed448639e4b32acc2a9fce1d8763b6fbe0f21f43a96c25c100b1b58fec50ba609c82fe18be9687111c4cc373b9143a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-verifier-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
