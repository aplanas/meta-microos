SUMMARY = "PowerMock Mockito API module"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the PowerMock Mockito API extension."
LICENSE = "Apache-2.0 & MIT"

PV = "1.6.5"

RPM_NAME = "powermock-api-mockito-1.6.5-4.10.noarch.rpm"
RPM_HASH = "116896271db68c5794bb6539fb7420d4dd32085ffb86a10d003ff33aeb2467a922196aa7c11766da7eac7f672d78cd46207cb1bd206edff000b3158bd0458ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled(mockito) \
mvn(org.powermock:powermock-api-mockito) \
mvn(org.powermock:powermock-api-mockito-common) \
mvn(org.powermock:powermock-api-mockito-common:pom:) \
mvn(org.powermock:powermock-api-mockito:pom:) \
osgi(org.powermock.powermock-api-mockito) \
osgi(org.powermock.powermock-api-mockito-common) \
powermock-api-mockito"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.hamcrest:hamcrest-core) \
mvn(org.mockito:mockito-core) \
mvn(org.powermock:powermock-api-support) \
powermock-common"

inherit rpm
