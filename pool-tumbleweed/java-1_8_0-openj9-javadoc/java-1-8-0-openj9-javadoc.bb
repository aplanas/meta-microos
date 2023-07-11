SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-javadoc-1.8.0.362-2.3.noarch.rpm"
RPM_HASH = "7fd536f55bbec07a4b18dfcccd2984fb1ec3219134edbe70d9efe6f94051ef911c7cf41dbffc6e39273bc6c4f65d99f344064973ac4fac64aa90a258a52b2673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openj9-javadoc \
java-1.8.0-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
