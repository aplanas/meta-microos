SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-jmods-11.0.19.0-1.1.aarch64.rpm"
RPM_HASH = "cece7fddce3a1a1915f4f2bf4d998204318cb8d5e1217e4841032991034f28b82d2c981fb987ff994db3f88836e5d23edd62f1d2e691869edaffae423815798b"

RPROVIDES:${PN} += "java-10-openjdk-jmods \
java-11-openjdk-jmods \
java-11-openjdk-jmods(aarch-64)"

RDEPENDS:${PN} += "java-11-openjdk-devel"

inherit rpm
