SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-javadoc-11.0.19.0-1.2.noarch.rpm"
RPM_HASH = "b9e926918a065b006556f309965483683a571234ab49c3613454aef1eac803bb10591d128cf3b46e33b919ccfdd439dc18680825a17e00d040275f7affc37d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-10-openjdk-javadoc \
java-11-javadoc \
java-11-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
