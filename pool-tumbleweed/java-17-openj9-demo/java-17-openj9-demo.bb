SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-demo-17.0.6.0-2.3.aarch64.rpm"
RPM_HASH = "a0713e680b36edae179b5da1e919e956cdaeaeb1ad0761b686ef8c99625176dcfcd2582e3c385f2605b7ccb0f68bf1963ef8246e7ce23a02f52dea08b08c705c"

RPROVIDES:${PN} += "java-17-openj9-demo"

RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
