SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openjdk-javadoc-1.8.0.382-1.1.noarch.rpm"
RPM_HASH = "031758a114bca4c0b70dcbf4e793556d88e9637e0a10b7a2fe046df7fb3ea759f253683e774b7f311a64275e75c7c5e200c49e4848e387c9a01740518332cdea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openjdk-javadoc \
java-1.8.0-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
