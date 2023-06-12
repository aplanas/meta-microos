SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-javadoc-1.8.0.362-2.1.noarch.rpm"
RPM_HASH = "07e39ec63d880f2691664ab4168fa5e6c758a945780462a13129946a803253d14c627e5ba28c148c566287f2ac9957d7c7ebd7c1c9daa519cd4425883c78d671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1.8.0-javadoc \
java-1_8_0-openj9-javadoc \
java-javadoc"
RDEPENDS:${PN} += "/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
