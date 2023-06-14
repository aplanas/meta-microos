SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-demo-11.0.18.0-2.1.aarch64.rpm"
RPM_HASH = "ed28aea004be82b119663028abc859195a0f0174f5766826b13dd37519c6e852f54c578da4db26c0888e453ea64b2488a77d479d8d108958c91f9caf5a3b9c16"

RPROVIDES:${PN} += "java-11-openj9-demo"

RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
