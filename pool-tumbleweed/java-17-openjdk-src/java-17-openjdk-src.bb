SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-src-17.0.7.0-3.1.aarch64.rpm"
RPM_HASH = "556c54ff9ac353f824eebc4ac208b0f6514fea3871015d02355b78dcb5de8649506fdd40ec12d19ae4996841c51e95a3d54ce9e3dd864f7384a2203ba0fa801a"

RPROVIDES:${PN} += "java-17-openjdk-src \
java-17-openjdk-src(aarch-64)"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
