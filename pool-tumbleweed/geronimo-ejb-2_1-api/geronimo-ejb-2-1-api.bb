SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Enterprise JavaBeans Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ejb-2_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "7a3902a635a086e5495b0b1c957e1b778bcce6624151f005bf41f8ccc44f2793c28a2303c51329ed1eabd735c42f4de4064fc0447c5db78b1a1f059892f341e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ejb \
ejb-2-1-api \
ejb-api \
geronimo-ejb-2-1-api \
mvn-org.apache.geronimo.specs-geronimo-ejb-2.1-spec \
mvn-org.apache.geronimo.specs-geronimo-ejb-2.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
jta-1-0-1B-api \
update-alternatives"

inherit rpm
