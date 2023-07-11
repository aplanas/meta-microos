SUMMARY = "OpenJDK 20 API Documentation"
DESCRIPTION = "The OpenJDK 20 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "20.0.1.0"

RPM_NAME = "java-20-openjdk-javadoc-20.0.1.0-1.2.noarch.rpm"
RPM_HASH = "eac771cb62c2fb9df026c55668f9381cfe355ff8fb1e0b4bd2bf938233bd6c014e7ec33713988ba5c544663c6f97f61201f3acdc06728814edada05eec756bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-20-javadoc \
java-20-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
