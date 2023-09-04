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

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openj9-accessibility-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "6b7f317104e7bde4843e57464303fe008496a403d83bd9716d9d7610bda9fd1ad1dde435cae17386f4f0f5032b634bb823ad0e8ef9df712c40f98350eba297aa"

RPROVIDES:${PN} += "config-java-1-8-0-openj9-accessibility \
java-1-8-0-openj9-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openj9 \
java-atk-wrapper"

inherit rpm
