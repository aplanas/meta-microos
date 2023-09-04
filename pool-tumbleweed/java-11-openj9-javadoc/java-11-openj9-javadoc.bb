SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.1"

RPM_NAME = "java-11-openj9-javadoc-11.0.20.1-1.1.noarch.rpm"
RPM_HASH = "bfe91d7b45e9beee52d1eefc67a0dd86dd16329779514519f645e4d76a08a3f965343bf091032c917e7acebb344b073fefe7ae0ad9b5792fd4eb83cc917f9b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-11-javadoc \
java-11-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
