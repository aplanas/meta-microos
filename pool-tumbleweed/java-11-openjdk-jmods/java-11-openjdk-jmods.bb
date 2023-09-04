SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openjdk-jmods-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "447bbfaaf3985925b8f00de27c3c66851352580cbe019ec8b8736cbe9ea306940546c410bd7061371d1b8f82ac9021b7cb8472690bf2d73b7109e5a8d0ed5c9c"

RPROVIDES:${PN} += "java-10-openjdk-jmods \
java-11-openjdk-jmods"

RDEPENDS:${PN} += "java-11-openjdk-devel"

inherit rpm
