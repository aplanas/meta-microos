SUMMARY = "OpenJDK 15 Source Bundle"
DESCRIPTION = "The OpenJDK 15 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-src-15.0.10.0-2.3.aarch64.rpm"
RPM_HASH = "27d5c301e43ba7811d00da2b53c8d8bb59dff65e47ce2e5e35d8caa8646711fa391c56b54fc1525d55a439a15503e24892c4b581a83180ba5d7b6665fb8ceec8"

RPROVIDES:${PN} += "java-15-openjdk-src \
java-15-openjdk-src(aarch-64)"
RDEPENDS:${PN} += "java-15-openjdk"

inherit rpm
