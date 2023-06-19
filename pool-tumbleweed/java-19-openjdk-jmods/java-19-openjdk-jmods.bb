SUMMARY = "JMods for OpenJDK 19"
DESCRIPTION = "The JMods for OpenJDK 19."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "19.0.2.0"

RPM_NAME = "java-19-openjdk-jmods-19.0.2.0-3.3.aarch64.rpm"
RPM_HASH = "9c58a1c797d4ea8745d3bfbccbb0ef6f4f10be729b0420f0aeec9726d29817bb7c460963594e87aa132a8d98415cc44344b33b181735a792df2d4ebc1ebbb051"

RPROVIDES:${PN} += "java-19-openjdk-jmods"

RDEPENDS:${PN} += "java-19-openjdk-devel"

inherit rpm
