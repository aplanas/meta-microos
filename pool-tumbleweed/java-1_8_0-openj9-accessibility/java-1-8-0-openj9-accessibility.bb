SUMMARY = "OpenJDK 8 accessibility connector"
DESCRIPTION = "Enables accessibility support in OpenJDK 8 by using java-atk-wrapper. \
This allows compatible at-spi2 based accessibility programs to work \
for AWT and Swing-based programs. \
 \
Please note, the java-atk-wrapper is still in beta, and OpenJDK 8 \
itself is still being tuned to be working with accessibility features. \
There are known issues with accessibility on, so please do not install \
this package unless you really need to."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-accessibility-1.8.0.362-2.1.aarch64.rpm"
RPM_HASH = "b3f847ab7aef66b2a35716c333c3279c506e4f7a4104dab37e05411cfe0c4b5adbbf779626ca0e177d2d218c8c5b5cf62e9b94749084cd5f7f4db4b5079aa61f"

RPROVIDES:${PN} += "config(java-1_8_0-openj9-accessibility) \
java-1_8_0-openj9-accessibility \
java-1_8_0-openj9-accessibility(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
java-1_8_0-openj9 \
java-atk-wrapper"

inherit rpm
