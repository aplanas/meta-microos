SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.382"

RPM_NAME = "java-1_8_0-openjdk-src-1.8.0.382-1.1.aarch64.rpm"
RPM_HASH = "2490d69240c7342227bcc0a55a40c88e5690739de9a1d4b797e070f1fa2a0796482135ba27d9cb8ac7ba952f098157c1fe9f2eaaf68657316dd8bba801b1d74c"

RPROVIDES:${PN} += "java-1-8-0-openjdk-src"

RDEPENDS:${PN} += "java-1-8-0-openjdk"

inherit rpm
