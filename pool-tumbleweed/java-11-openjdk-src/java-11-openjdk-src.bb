SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openjdk-src-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "09e0000325a57039aa2933cb2ee43c5f22a1686c56552468362eaf71a22c2fa602639e0ecb91c9df1e41d5ad9e3c06ede647bfcebdc45366e75fb647f7e7ed9d"

RPROVIDES:${PN} += "java-10-openjdk-src \
java-11-openjdk-src"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
