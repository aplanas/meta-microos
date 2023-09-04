SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openjdk-demo-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "5e1f68a047b9730b30d00880df507079c21cc1351c4315dfa6b618838e64101f43a0cd9c220eb646b24d7cf1dfd95ff1f4d9153acdb805692d30c97da8dfaccf"

RPROVIDES:${PN} += "java-10-openjdk-demo \
java-11-openjdk-demo"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
