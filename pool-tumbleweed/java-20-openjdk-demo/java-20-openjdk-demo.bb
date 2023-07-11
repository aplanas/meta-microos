SUMMARY = "OpenJDK 20 Demos"
DESCRIPTION = "The OpenJDK 20 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "20.0.1.0"

RPM_NAME = "java-20-openjdk-demo-20.0.1.0-1.2.aarch64.rpm"
RPM_HASH = "cd119947709aa1d369cf2054fc3777c0f9d539c16a06be2b7cee9c204fc9a70066efd4fd5ce072bff6f3949a315ad2b0fb9e7ef69a944f5784abc54d6504dbc9"

RPROVIDES:${PN} += "java-20-openjdk-demo"

RDEPENDS:${PN} += "java-20-openjdk"

inherit rpm
