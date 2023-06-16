SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-javadoc-11.0.19.0-1.1.noarch.rpm"
RPM_HASH = "d3d648a5ede525e2bbaf821b7ae3427bf82ff9fd3302f9e58a379d7a151bc7e4fa1d14914002b94c328a6c3e885a774a3f277aec5982717f9865f2a26e4f4260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-10-openjdk-javadoc \
java-11-javadoc \
java-11-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
