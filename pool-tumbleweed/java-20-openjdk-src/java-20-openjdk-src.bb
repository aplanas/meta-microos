SUMMARY = "OpenJDK 20 Source Bundle"
DESCRIPTION = "The OpenJDK 20 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "20.0.1.0"

RPM_NAME = "java-20-openjdk-src-20.0.1.0-1.2.aarch64.rpm"
RPM_HASH = "a26f74f121990bbb5cb45029f8da4de65fea0c28dacf4bf025b90387e5a21f159a14110dde6abf3380c14ea9c96d890b00a6b78cd771d4d3bdd24bfe3f14e476"

RPROVIDES:${PN} += "java-20-openjdk-src"

RDEPENDS:${PN} += "java-20-openjdk"

inherit rpm
