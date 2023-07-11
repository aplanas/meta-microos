SUMMARY = "Java Foreign Function Interface"
DESCRIPTION = "An optimized Java interface to libffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-1.3.11-1.2.aarch64.rpm"
RPM_HASH = "9118adf96e03c4fd06366c387cc3aaadd582b8ec3a9aab30fda49a98d0d64dbc1db804c70337ff9338dcaea158e7950c72c24369474bf38b5887bc04897c6a20"

RPROVIDES:${PN} += "jffi \
mvn-com.github.jnr-jffi \
mvn-com.github.jnr-jffi-pom- \
osgi-com.github.jnr.jffi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
