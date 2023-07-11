SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-src-1.8.0.372-1.2.aarch64.rpm"
RPM_HASH = "4e9482a7eb46f8a4583a8e65647a5cfe27a022bb0659012af1f3fba25bbebcaaf7aafa729bba7a96c2fbeb677d9c402ab1380d1dd26d579fde1eff9a1f8641c5"

RPROVIDES:${PN} += "java-1-8-0-openjdk-src"

RDEPENDS:${PN} += "java-1-8-0-openjdk"

inherit rpm
