SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.1"

RPM_NAME = "java-17-openjdk-src-17.0.8.1-1.1.aarch64.rpm"
RPM_HASH = "20a28f09bf778d69092b0daae4d7eb4cb4d85c90867af6ed6f14d1a667a0483011cf06e838719be082b664868dad818e2c69b94d3ea057734127a51528ed3394"

RPROVIDES:${PN} += "java-17-openjdk-src"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
