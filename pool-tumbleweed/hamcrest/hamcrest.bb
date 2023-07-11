SUMMARY = "Library of matchers for building test expressions"
DESCRIPTION = "Provides a library of matcher objects (also known as constraints or \
predicates) allowing 'match' rules to be defined declaratively, to be \
used in other frameworks. Typical scenarios include testing frameworks, \
mocking libraries and UI validation rules."
LICENSE = "BSD-3-Clause"

PV = "2.2"

RPM_NAME = "hamcrest-2.2-1.4.noarch.rpm"
RPM_HASH = "b8e4e9f63d3b119e5b3d6d71868c36ccf55352859ccbedbcaaf8068ab9e3057415ff699d611c018aac1e9590c2f7298e2b80b6b2402710799d91113dbf9bc3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hamcrest \
hamcrest-core \
mvn-org.hamcrest-hamcrest \
mvn-org.hamcrest-hamcrest-all \
mvn-org.hamcrest-hamcrest-all-pom- \
mvn-org.hamcrest-hamcrest-core \
mvn-org.hamcrest-hamcrest-core-pom- \
mvn-org.hamcrest-hamcrest-library \
mvn-org.hamcrest-hamcrest-library-pom- \
mvn-org.hamcrest-hamcrest-pom- \
osgi-org.hamcrest"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
