SUMMARY = "HK2 ServiceLocator Default Implementation"
DESCRIPTION = "Hundred Kilobytes Kernel ServiceLocator Default Implementation."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-locator-2.5.0-2.3.noarch.rpm"
RPM_HASH = "3e59521d3577f19a3f0c31d33b4aef736b152cf9fffcbaebd06a7e7244649c51c5eba65cde423db1cd8b6fd3888518762df7565ae0fa232263a7cf64b1c2c3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-locator \
mvn(org.glassfish.hk2:hk2-locator) \
mvn(org.glassfish.hk2:hk2-locator:pom:) \
osgi(org.glassfish.hk2.locator)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(aopalliance:aopalliance) \
mvn(javax.annotation:javax.annotation-api) \
mvn(javax.inject:javax.inject) \
mvn(org.glassfish.hk2:hk2-api) \
mvn(org.glassfish.hk2:hk2-utils) \
mvn(org.javassist:javassist)"

inherit rpm
