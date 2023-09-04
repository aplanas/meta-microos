SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openj9-jmods-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "7289ad05297ee414dfd4b0838e6a42bf6d03ea84927321b73d1440b648fb7d9693b6d95d511e3d30a4bf6f5e55e87beba1bbc3e118e3fd2642750b17f7f74c14"

RPROVIDES:${PN} += "java-11-openj9-jmods"

RDEPENDS:${PN} += "java-11-openj9-devel"

inherit rpm
