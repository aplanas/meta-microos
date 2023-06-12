SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-src-11.0.18.0-2.1.aarch64.rpm"
RPM_HASH = "2ecbbbb6d47cdbdd9fdfbc49c0acb9840e6feb4606f640e86d57b0f34a372b08e3023cd2e909c06e4d8aef16638b49d0d5e70a99ff971e17bbfac4f38c632fdc"

RPROVIDES:${PN} += "java-11-openj9-src \
java-11-openj9-src(aarch-64)"
RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
