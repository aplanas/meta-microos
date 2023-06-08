SUMMARY = "Java run-time support for ANTLR-generated parsers"
DESCRIPTION = "Java run-time support for ANTLR-generated parsers"
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-java-3.5.3-2.3.noarch.rpm"
RPM_HASH = "3e262961b28482277e459c932ebf3fcd9cdcde2c0786f57a16d8c46dd1a1d1c7ba5d03892bfe0ab1554f5ee5213f5bdf1021775626fe226c4d0f692a9e16ea5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-java mvn(org.antlr:antlr-runtime) mvn(org.antlr:antlr-runtime:pom:) osgi(org.antlr.runtime)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
