SUMMARY = "A collection of general purpose utilities for c3p0"
DESCRIPTION = "Originally part of c3p0, mchange-commons is a set of general purpose \
utilities."
LICENSE = "EPL-1.0 | LGPL-2.0-only"

PV = "0.2.20"

RPM_NAME = "mchange-commons-0.2.20-4.6.noarch.rpm"
RPM_HASH = "02e67674c52cd8e01a8772afe897a15ca6ebf32a15aa45452f4db8aaee75b7459713a289aa6a814d9c7d95d52aabc8e3f0e817ea59a7dd8fa40b5482f182a302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mchange-commons \
mvn-com.mchange-mchange-commons-java \
mvn-com.mchange-mchange-commons-java-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
