SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.8.1"

RPM_NAME = "java-17-openjdk-demo-17.0.8.1-1.1.aarch64.rpm"
RPM_HASH = "afb45e728c57f00c343272fcc975bfbb041ce1692350b4c00740f561887a7e25dca0585532e797d7604ccee738699a71b8c9fa7d418d14f2559573a1154eecd3"

RPROVIDES:${PN} += "java-17-openjdk-demo"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
