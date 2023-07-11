SUMMARY = "OpenRegex regular expressions library"
DESCRIPTION = "OpenRegex is an efficient and flexible library for running regular expressions \
over sequences of user-defined objects."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "openregex-1.1.1-3.14.noarch.rpm"
RPM_HASH = "fac96982cbacd53325b64002f43c6257915c4a070b4f7f3c55e0dfebe838273a5ba3292431255af518a3212a0d86659436b5a3a9f66141f9757c4fc8414247bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-openregex \
mvn-edu.washington.cs.knowitall-openregex-pom- \
openregex"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.guava-guava"

inherit rpm
