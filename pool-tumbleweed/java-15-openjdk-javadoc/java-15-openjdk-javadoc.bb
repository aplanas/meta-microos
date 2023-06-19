SUMMARY = "OpenJDK 15 API Documentation"
DESCRIPTION = "The OpenJDK 15 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-javadoc-15.0.10.0-2.3.noarch.rpm"
RPM_HASH = "e1e9b226d5a93f2f2b89c8dae0acf937e4fbb20ff2a5d308a58fa1bd6eeba9eba11f17876ef9a2a48eb553d09b870495facecc648826c7a90ea340a7cc80d707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-15-javadoc \
java-15-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
