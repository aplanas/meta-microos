SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.1"

RPM_NAME = "java-17-openjdk-jmods-17.0.8.1-1.1.aarch64.rpm"
RPM_HASH = "ae67a6dd037e22ea7407b0d836412bdec28bbd9a2e67ebbfda5604b7e428e11efd0dddeb5c4709d3624e760c55729f707d0de7e5b5d24ceaa3fa93bf72e7f73c"

RPROVIDES:${PN} += "java-17-openjdk-jmods"

RDEPENDS:${PN} += "java-17-openjdk-devel"

inherit rpm
