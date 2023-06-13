SUMMARY = "Javadoc for maven-enforcer"
DESCRIPTION = "API documentation for maven-enforcer."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-javadoc-1.4.1-3.10.noarch.rpm"
RPM_HASH = "17d45aa024553bdab8c6dbd74e1652128e5270f1bb777cac69641a8e59b122346d4ac7f4ed14f211903473bce5b41ac9da663246f43ce48d0674303958f40af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
