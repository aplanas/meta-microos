SUMMARY = "Mock objects for interfaces in JUnit tests"
DESCRIPTION = "EasyMock provides Mock Objects for interfaces in JUnit tests by generating \
them on the fly using Java's proxy mechanism. Due to EasyMock's unique style \
of recording expectations, most refactorings will not affect the Mock Objects. \
So EasyMock is a perfect fit for Test-Driven Development."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "easymock-3.6-2.24.noarch.rpm"
RPM_HASH = "aee3ba4955bc026494a27e2f68919579ebe46d09ac9cdf088b69aa2c4e7b253bd6d99764151f5c2c31ae4f85a6c56fc7dfd712a1d9d601b614300775b94b47d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easymock mvn(org.easymock:easymock) mvn(org.easymock:easymock-parent:pom:) mvn(org.easymock:easymock-test-java8) mvn(org.easymock:easymock-test-java8:pom:) mvn(org.easymock:easymock-test-testng) mvn(org.easymock:easymock-test-testng:pom:) mvn(org.easymock:easymock:pom:) osgi(org.easymock)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(cglib:cglib) mvn(org.objenesis:objenesis) mvn(org.ow2.asm:asm)"

inherit rpm
