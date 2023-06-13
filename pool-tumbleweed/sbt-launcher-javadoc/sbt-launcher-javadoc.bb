SUMMARY = "API Documentation for sbt-launcher"
DESCRIPTION = "JavaDoc documentation for sbt-launcher"
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "sbt-launcher-javadoc-1.1.2-2.9.noarch.rpm"
RPM_HASH = "6675bd2b5c4c65447d13685027e4986a9c1a9d9c0b31763b68aa885db055920013dec1cde81561004233ae2df881dba585a8c0940c11c497fe83eff6fcf6e549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sbt-launcher-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
