SUMMARY = "OpenJDK 17 API Documentation"
DESCRIPTION = "The OpenJDK 17 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openj9-javadoc-17.0.8.0-2.1.noarch.rpm"
RPM_HASH = "785383bd36730bc2b0091c7c0215c7997eb008c5fa31dd67c33f5e88ebea126da2064aa44be1e81c8159f01733f1a99de90e19de6ba00189929e97914fb61699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-17-javadoc \
java-17-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
