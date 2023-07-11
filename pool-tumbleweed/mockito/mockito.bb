SUMMARY = "A Java mocking framework"
DESCRIPTION = "Mockito is a mocking framework. It lets you write tests. Tests \
produce clean verification errors."
LICENSE = "MIT"

PV = "1.10.19"

RPM_NAME = "mockito-1.10.19-5.8.noarch.rpm"
RPM_HASH = "8ebd9fafbf6f528e710456c2dd72c1d950e9bece0274805a882966e1a1e320730c6d30c2ac5b7f149163887990b5887ee18fff612076d43e1e4aff6bee565590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito \
mvn-org.mockito-mockito-all \
mvn-org.mockito-mockito-all-pom- \
mvn-org.mockito-mockito-core \
mvn-org.mockito-mockito-core-pom- \
osgi-org.mockito.mockito-core"

RDEPENDS:${PN} += "cglib \
hamcrest \
java-headless \
javapackages-filesystem \
junit \
mvn-net.sf.cglib-cglib \
mvn-org.hamcrest-hamcrest-core \
mvn-org.objenesis-objenesis \
objenesis"

inherit rpm
