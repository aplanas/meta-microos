SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openjdk-src-17.0.8.0-1.1.aarch64.rpm"
RPM_HASH = "89f1819ff48d25b18b650c796b5d69c12f33e751898a18caba92553593ed762225685097cd86c3898293c3f34496073dfd694ea1c8dcc3abb8c2f2a5a9093bae"

RPROVIDES:${PN} += "java-17-openjdk-src"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
