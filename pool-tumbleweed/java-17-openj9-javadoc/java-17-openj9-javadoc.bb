SUMMARY = "OpenJDK 17 API Documentation"
DESCRIPTION = "The OpenJDK 17 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-javadoc-17.0.6.0-2.1.noarch.rpm"
RPM_HASH = "434db48fbc407fcaddbed3125f4787d7fa47b85106afa3be407d8aa7a5dc8532bd8e966c0006cb3a3f621e86b0462bc6a01205c30ee4b705cc82ef790014cf76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-17-javadoc \
java-17-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
update-alternatives"

inherit rpm
