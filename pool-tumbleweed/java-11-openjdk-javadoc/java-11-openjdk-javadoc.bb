SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.0"

RPM_NAME = "java-11-openjdk-javadoc-11.0.20.0-1.1.noarch.rpm"
RPM_HASH = "f5b54667ddd1aba1e2d72626802992639e799ca45d4e16d6abe82e1ddd0f04769f2004058d30153a16c50e39b6249d384a3bbc400b15eff89dc428700ee3224d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-10-openjdk-javadoc \
java-11-javadoc \
java-11-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
