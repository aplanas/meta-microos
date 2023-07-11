SUMMARY = "OpenJDK 8 accessibility connector"
DESCRIPTION = "Enables accessibility support in OpenJDK 8 by using java-atk-wrapper. \
This allows compatible at-spi2 based accessibility programs to work \
for AWT and Swing-based programs. \
 \
Please note, the java-atk-wrapper is still in beta, and OpenJDK 8 \
itself is still being tuned to be working with accessibility features. \
There are known issues with accessibility on, so please do not install \
this package unless you really need to."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-accessibility-1.8.0.372-1.2.aarch64.rpm"
RPM_HASH = "83a646b6ecb4684ecc7ef3cfe4d1712f26b4967cdae6dc597ee71a7c68259a55f0253602b366b337dfef974e8f22336ec01a50285a57bed6f144d17f35c3eecc"

RPROVIDES:${PN} += "config-java-1-8-0-openjdk-accessibility \
java-1-8-0-openjdk-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk \
java-atk-wrapper"

inherit rpm
