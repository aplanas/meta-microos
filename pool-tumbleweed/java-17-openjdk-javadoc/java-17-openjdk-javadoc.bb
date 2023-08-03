SUMMARY = "OpenJDK 17 API Documentation"
DESCRIPTION = "The OpenJDK 17 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openjdk-javadoc-17.0.8.0-1.1.noarch.rpm"
RPM_HASH = "c565257e74992f3d49dabf349b442ceaec6034fa07b11d2b8a76fc5bdee697be304c6f4ef9dff938e99ea827b636311c2f3434051a105ecb12d7765f3c24b4c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-17-javadoc \
java-17-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
