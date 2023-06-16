SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-javadoc-11.0.18.0-2.1.noarch.rpm"
RPM_HASH = "e42c3842f4caff024d8fdab092d3aeccbc2676abb3485584499713685f66b047adc62856c1640bd1b5e4c658a150172430e573f021e6bd39e66a74a872257c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-11-javadoc \
java-11-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
