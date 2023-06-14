SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-jmods-11.0.18.0-2.1.aarch64.rpm"
RPM_HASH = "a96f79df5ea35ee35458d8eb7e8b8449b224f7e9c491ab4b8b9e5d0d8f2661f819dd237deb4d398cec8f3608510f0792a03093c10233129f970e30bbe2f3b123"

RPROVIDES:${PN} += "java-11-openj9-jmods"

RDEPENDS:${PN} += "java-11-openj9-devel"

inherit rpm
