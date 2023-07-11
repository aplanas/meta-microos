SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-jmods-17.0.7.0-3.2.aarch64.rpm"
RPM_HASH = "3ac87b7e96b3afbcac03778cd73d26fe964b2e974896038646c0faa56b02bd4e86c77cca931ab450692d70d15e4601687f9ad0c3b2681d7d412c8a69af3e7ce8"

RPROVIDES:${PN} += "java-17-openjdk-jmods"

RDEPENDS:${PN} += "java-17-openjdk-devel"

inherit rpm
