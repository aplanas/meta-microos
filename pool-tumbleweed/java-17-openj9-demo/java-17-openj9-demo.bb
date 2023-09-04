SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openj9-demo-17.0.8.0-2.1.aarch64.rpm"
RPM_HASH = "ea67f0ef9d71c2ea6fadacd82b36c932dfcecd3ddae26e5aef7fac41609057d7c525b65fb77d27a81eb4578ad6f85b5e14014a2c71424b33228e4eaa00f64ebe"

RPROVIDES:${PN} += "java-17-openj9-demo"

RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
