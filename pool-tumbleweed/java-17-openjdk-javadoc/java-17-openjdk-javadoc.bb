SUMMARY = "OpenJDK 17 API Documentation"
DESCRIPTION = "The OpenJDK 17 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-javadoc-17.0.7.0-3.1.noarch.rpm"
RPM_HASH = "83b4fa2b1c49b7004ea6426737e556500b4b1e285f75cf193acdf7433b0bbdf7daf873fe7e8a8db18b6524cd8f4c37e5a75a86cb858289c539204bb9f98e19ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-17-javadoc \
java-17-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
