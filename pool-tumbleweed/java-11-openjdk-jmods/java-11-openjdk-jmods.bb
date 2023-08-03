SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.0"

RPM_NAME = "java-11-openjdk-jmods-11.0.20.0-1.1.aarch64.rpm"
RPM_HASH = "f5e87da83d6a8b508218f0284218f6146bc93f18eb444d589f8fa85f40e82f10c0b383c228f87445e3917cbaf9b9eac174e30ac5cbac52b06bf10817c1ef3b66"

RPROVIDES:${PN} += "java-10-openjdk-jmods \
java-11-openjdk-jmods"

RDEPENDS:${PN} += "java-11-openjdk-devel"

inherit rpm
