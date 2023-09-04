SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openj9-jmods-17.0.8.0-2.1.aarch64.rpm"
RPM_HASH = "680ae1b35a6d1438cd0e25f696ece59772fa1ab792ac52f9b69e145c7f7a42f9fb243a1fe307f0585692fdf5239757816bdbb37ec7905f8ba5fc8dcf09785229"

RPROVIDES:${PN} += "java-17-openj9-jmods"

RDEPENDS:${PN} += "java-17-openj9-devel"

inherit rpm
