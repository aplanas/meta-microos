SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-src-17.0.6.0-2.3.aarch64.rpm"
RPM_HASH = "570bc6bb6d77f6f60a71b86d93fa312c6f64e50217c1866f7df4dcd4b2029872ca3e8b8c5d64d3fe53dc1d4e21b43e5f817f86498c77d5d0de53b698f2b31b90"

RPROVIDES:${PN} += "java-17-openj9-src"

RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
