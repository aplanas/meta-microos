SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-javadoc-1.8.0.372-1.1.noarch.rpm"
RPM_HASH = "798a986935eea4fdba86e488dfbf1ad1d9b5a9f211b96b0c0fad8f4c6377e93955be3dad3630f44915a363777e0a7592ae7971370a1b32046eaa8e83d8523122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openjdk-javadoc \
java-1.8.0-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
