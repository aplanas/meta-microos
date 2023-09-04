SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openjdk-javadoc-11.0.20.1-1.1.noarch.rpm"
RPM_HASH = "47b75c97b0a22350a4138f5b1f9e141ac84a2bfa1088134821a6614f62415b3c28cda742311ac68d6fb1a8be739bf51391d1c1b675b915df7b5663564cf415fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-10-openjdk-javadoc \
java-11-javadoc \
java-11-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
