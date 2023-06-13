SUMMARY = "OpenJDK 18 API Documentation"
DESCRIPTION = "The OpenJDK 18 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "18.0.2.0"

RPM_NAME = "java-18-openjdk-javadoc-18.0.2.0-4.3.noarch.rpm"
RPM_HASH = "ffdb4de983a24012f1870bb50fced099f3dda53d904f3a55b044d9f5c7b8adc0ff883c079fa14015f224aab6b5374f32e9dfbc64ec5c152fca0a85f271b8d109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-18-javadoc \
java-18-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
