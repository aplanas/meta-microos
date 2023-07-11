SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-demo-11.0.19.0-1.2.aarch64.rpm"
RPM_HASH = "92edd342b675dfeb399c49072397a04738d25b51fa02df48c1c3c8841fe59b8f818a6ce9e66ebed3a674e35cf48fabeba1cb433dbdc18c25d978bad6af35ef33"

RPROVIDES:${PN} += "java-10-openjdk-demo \
java-11-openjdk-demo"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
