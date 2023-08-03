SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.0"

RPM_NAME = "java-11-openjdk-demo-11.0.20.0-1.1.aarch64.rpm"
RPM_HASH = "5bc1e03b7a92f2a723506191682de9f75198bd3dc34b6d9d08c99a9ea577b052869f4ee78c8aeba3bfaa361d658d9f15c6227641322e3b0c19f0fc20d77f607d"

RPROVIDES:${PN} += "java-10-openjdk-demo \
java-11-openjdk-demo"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
