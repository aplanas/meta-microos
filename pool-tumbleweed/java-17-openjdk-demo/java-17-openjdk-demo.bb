SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.0"

RPM_NAME = "java-17-openjdk-demo-17.0.8.0-1.1.aarch64.rpm"
RPM_HASH = "1d7eb676263badf776f019460d9733960cb20c2ba7b912f46e99fe9a8cdc6a18d869d0dc160c0dab7a87622c78579fe89aecf435c3a1731b7648e72a64c039f4"

RPROVIDES:${PN} += "java-17-openjdk-demo"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
