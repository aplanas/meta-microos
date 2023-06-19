SUMMARY = "OpenJDK 18 Demos"
DESCRIPTION = "The OpenJDK 18 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "18.0.2.0"

RPM_NAME = "java-18-openjdk-demo-18.0.2.0-4.3.aarch64.rpm"
RPM_HASH = "08de2e48453106568e1edcd239ed1215d41feb431ec3041287df647253cc52f541336e5e8e4a28f48f8249055dbda7c2a3aa7bbe7056ea343f22b0e61d26b2ea"

RPROVIDES:${PN} += "java-18-openjdk-demo"

RDEPENDS:${PN} += "java-18-openjdk"

inherit rpm
