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

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openjdk-accessibility-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "acc5743e3e0a788e08a95974a1c4913573b5ba9cadbc8bf60a5b4c07652a864bff02f481fce5399b89f68f7696d49aceb53940f9fab9db5a9ad536a53fe09254"

RPROVIDES:${PN} += "config-java-1-8-0-openjdk-accessibility \
java-1-8-0-openjdk-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk \
java-atk-wrapper"

inherit rpm
