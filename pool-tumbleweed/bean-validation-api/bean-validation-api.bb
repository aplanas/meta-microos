SUMMARY = "Bean Validation API (JSR 349)"
DESCRIPTION = "This package contains Bean Validation (JSR-349) API."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bean-validation-api-2.0.1-1.18.noarch.rpm"
RPM_HASH = "8bc9edb4b4b50638604d3aa69709b67b96170b8f4c5ee59b815028285e60f20311ef457f3a42e7fd403e1a6b82a3ada009056a65c90213681988314e6c47ae2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bean-validation-api \
mvn-javax.validation-validation-api \
mvn-javax.validation-validation-api-pom- \
osgi-javax.validation.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
