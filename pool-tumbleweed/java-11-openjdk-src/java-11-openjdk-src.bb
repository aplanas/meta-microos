SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-src-11.0.19.0-1.2.aarch64.rpm"
RPM_HASH = "fcf0b69d7abc6acf145d3874e0e710fc6d7ee8a47b35c13269f13aeb0d3bf4ba14e7d0a497befb67f82b9b01330e8c9598bb3ee8db02d302fafcc92bb5bae672"

RPROVIDES:${PN} += "java-10-openjdk-src \
java-11-openjdk-src"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
