SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-demo-17.0.7.0-3.1.aarch64.rpm"
RPM_HASH = "3842a8f5fd07c311609abdb23b8a09fef558712cd9cf9fe14b2bae397582175666c8f986e8dc37382a200f0e6fea01079f8ce5a45cd81b003c0d388c0f217715"

RPROVIDES:${PN} += "java-17-openjdk-demo"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
