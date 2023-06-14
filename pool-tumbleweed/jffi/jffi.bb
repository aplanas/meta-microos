SUMMARY = "Java Foreign Function Interface"
DESCRIPTION = "An optimized Java interface to libffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-1.3.11-1.1.aarch64.rpm"
RPM_HASH = "1cdac3650a437bc5324e2a587fed13a4fbaff582c2e5465029976164d1655b1829dfe9b248b7a6af476d974c191fdb475fa8bd9a12593bea854f830f7bcebcb8"

RPROVIDES:${PN} += "jffi \
mvn-com.github.jnr-jffi \
mvn-com.github.jnr-jffi-pom- \
osgi-com.github.jnr.jffi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
