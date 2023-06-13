SUMMARY = "OpenJDK 8 accessibility connector"
DESCRIPTION = "Enables accessibility support in OpenJDK 8 by using java-atk-wrapper. \
This allows compatible at-spi2 based accessibility programs to work \
for AWT and Swing-based programs. \
 \
Please note, the java-atk-wrapper is still in beta, and OpenJDK 8 \
itself is still being tuned to be working with accessibility features. \
There are known issues with accessibility on, so please do not install \
this package unless you really need to."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-accessibility-1.8.0.372-1.1.aarch64.rpm"
RPM_HASH = "aad4441514ba4f59e7245a7cbaad12007bf008d977e61fefc34be24515f9b075d3007875278ae32b2ad2c115223aa5d5d8fbcc2a7fb88d2ab2eeb26f99a45d90"

RPROVIDES:${PN} += "config(java-1_8_0-openjdk-accessibility) \
java-1_8_0-openjdk-accessibility \
java-1_8_0-openjdk-accessibility(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
java-1_8_0-openjdk \
java-atk-wrapper"

inherit rpm
