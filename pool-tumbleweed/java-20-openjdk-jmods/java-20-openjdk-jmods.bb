SUMMARY = "JMods for OpenJDK 20"
DESCRIPTION = "The JMods for OpenJDK 20."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "20.0.1.0"

RPM_NAME = "java-20-openjdk-jmods-20.0.1.0-1.2.aarch64.rpm"
RPM_HASH = "9706cd7fc14228eef8c05cbd48d4446cbb70774a730cbb1602e5b37484f0536635852d1279b260d2456ff30e283bd5a6d938d66e14bc98da2814499b06104642"

RPROVIDES:${PN} += "java-20-openjdk-jmods"

RDEPENDS:${PN} += "java-20-openjdk-devel"

inherit rpm
