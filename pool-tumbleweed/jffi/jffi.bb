SUMMARY = "Java Foreign Function Interface"
DESCRIPTION = "An optimized Java interface to libffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-1.3.11-2.1.aarch64.rpm"
RPM_HASH = "13c7d0f784def99aa1e8b9a4b96f2a964461f480ae17c620d18d9263d3e74701c5213a22fc8186ccd59b37cd79ac57bf158a499512fd2eca2c9e9a7f749ed91b"

RPROVIDES:${PN} += "jffi \
mvn-com.github.jnr-jffi \
mvn-com.github.jnr-jffi-pom- \
osgi-com.github.jnr.jffi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
