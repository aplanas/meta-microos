SUMMARY = "A Java mocking framework"
DESCRIPTION = "Mockito is a mocking framework. It lets you write tests. Tests \
produce clean verification errors."
LICENSE = "MIT"

PV = "1.10.19"

RPM_NAME = "mockito-1.10.19-5.7.noarch.rpm"
RPM_HASH = "1041cf1b27d477a1ca6de41a7af5c9c8dfca3dde3f574d56c9ee16670e027c55805468b7103a0a229912c202b8d77f950e4615f6e764b376c2372870faa8bab3"
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
