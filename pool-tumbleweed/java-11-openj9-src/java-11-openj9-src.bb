SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openj9-src-11.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "51797972c6f694ef5cfba1fb0706837f1946e05167a7b8dfedd538a4ca5d20fc3f524bc73a72c12c75e0a6a1ae88a31c284ad8633ddf1e761701eef0055f0c74"

RPROVIDES:${PN} += "java-11-openj9-src"

RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
