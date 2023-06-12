SUMMARY = "OpenJDK 13 Demos"
DESCRIPTION = "The OpenJDK 13 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-demo-13.0.14.0-2.3.aarch64.rpm"
RPM_HASH = "025a563bae6d280a286493866ab695d7a4d1a30aa36c499a44dc6dc56fbdd0a4b65346f860f73437ce0d318ab511a347f35eae9104064045986ef56fda18df3f"

RPROVIDES:${PN} += "java-13-openjdk-demo \
java-13-openjdk-demo(aarch-64)"
RDEPENDS:${PN} += "java-13-openjdk"

inherit rpm
