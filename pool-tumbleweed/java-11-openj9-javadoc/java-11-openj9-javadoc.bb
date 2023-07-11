SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-javadoc-11.0.18.0-2.3.noarch.rpm"
RPM_HASH = "c5c144b269d1f575514f2a715dc8a966deed86244ba767aee87863ff9bae4b34adeafee77d2565ff6ab2a2ad2523c81b3b82891c004d60991c8fc031602e43cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-11-javadoc \
java-11-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
