SUMMARY = "OpenJDK 8 accessibility connector"
DESCRIPTION = "Enables accessibility support in OpenJDK 8 by using java-atk-wrapper. \
This allows compatible at-spi2 based accessibility programs to work \
for AWT and Swing-based programs. \
 \
Please note, the java-atk-wrapper is still in beta, and OpenJDK 8 \
itself is still being tuned to be working with accessibility features. \
There are known issues with accessibility on, so please do not install \
this package unless you really need to."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-accessibility-1.8.0.362-2.3.aarch64.rpm"
RPM_HASH = "ea221cd146c720ca37d3352d85aec6fc13a26800e5c6ab225e8edb72e38f83837702ac9ecbd6ec2251da0f0c577d65136c51e88c9410b9f29afcdcca2e79762c"

RPROVIDES:${PN} += "config-java-1-8-0-openj9-accessibility \
java-1-8-0-openj9-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openj9 \
java-atk-wrapper"

inherit rpm
