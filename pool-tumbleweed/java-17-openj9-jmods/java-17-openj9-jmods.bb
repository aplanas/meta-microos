SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-jmods-17.0.6.0-2.1.aarch64.rpm"
RPM_HASH = "bfa98b7a898e5633d083fc2eba110411983b7f432eaa13ae63defbc3fae1f4794d127f1cf94ad7573e30f4da319b03f0da027b224e4f93de61ed640d0f636e2f"

RPROVIDES:${PN} += "java-17-openj9-jmods"

RDEPENDS:${PN} += "java-17-openj9-devel"

inherit rpm
