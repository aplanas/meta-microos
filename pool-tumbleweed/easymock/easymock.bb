SUMMARY = "Mock objects for interfaces in JUnit tests"
DESCRIPTION = "EasyMock provides Mock Objects for interfaces in JUnit tests by generating \
them on the fly using Java's proxy mechanism. Due to EasyMock's unique style \
of recording expectations, most refactorings will not affect the Mock Objects. \
So EasyMock is a perfect fit for Test-Driven Development."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "easymock-3.6-2.25.noarch.rpm"
RPM_HASH = "5991c59c9099a6f444e29add6c80be3109e659188763ac40a2c4f72489acfb6763bbe40353bfb9a0935b1b24798506f2a0ab2d644e8f7ef2748573ada3380537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easymock \
mvn-org.easymock-easymock \
mvn-org.easymock-easymock-parent-pom- \
mvn-org.easymock-easymock-pom- \
mvn-org.easymock-easymock-test-java8 \
mvn-org.easymock-easymock-test-java8-pom- \
mvn-org.easymock-easymock-test-testng \
mvn-org.easymock-easymock-test-testng-pom- \
osgi-org.easymock"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-cglib-cglib \
mvn-org.objenesis-objenesis \
mvn-org.ow2.asm-asm"

inherit rpm
