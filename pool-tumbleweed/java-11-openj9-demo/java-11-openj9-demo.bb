SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openj9-demo-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "2ba6d4a8e66e2429a71c4e1c6047114548d7868e0c46492b8ad3a37d2a38f46fe50a8175233d1ee5f213125c4a4f156732af0040813a720eebadee7558e1d283"

RPROVIDES:${PN} += "java-11-openj9-demo"

RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
