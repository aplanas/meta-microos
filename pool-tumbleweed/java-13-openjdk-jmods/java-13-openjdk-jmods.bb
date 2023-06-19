SUMMARY = "JMods for OpenJDK 13"
DESCRIPTION = "The JMods for OpenJDK 13."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-jmods-13.0.14.0-2.3.aarch64.rpm"
RPM_HASH = "76d506a8241c6073c9bf6b97661e0f8f78e9ebe3bab787e168b413105ae679e9430e2a20f7006d680f7479fd31bdc9d2f7b1db9bd862dcda30f1724a42d1fb66"

RPROVIDES:${PN} += "java-13-openjdk-jmods"

RDEPENDS:${PN} += "java-13-openjdk-devel"

inherit rpm
