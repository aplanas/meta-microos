SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-javadoc-1.8.0.372-1.2.noarch.rpm"
RPM_HASH = "2a38f59a03223c60589de9529fd57c25d82e37f44335163586ebafbf7e5ef89156ecb71eff0e15275e4c161c918409b4aaa3fceb664c99791d13ebd20dde7e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openjdk-javadoc \
java-1.8.0-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
