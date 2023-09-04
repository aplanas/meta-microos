SUMMARY = "OpenJDK 17 API Documentation"
DESCRIPTION = "The OpenJDK 17 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.1"

RPM_NAME = "java-17-openjdk-javadoc-17.0.8.1-1.1.noarch.rpm"
RPM_HASH = "1015f676e1f0a7d19c63b872203049713e151e2094ab5ef1aa9a813e5737d320b34440e4a3f2c7f8e873ffc3669ba6243c0e7bb9053008739aabbcce6c801467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-17-javadoc \
java-17-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
