SUMMARY = "Java library for accessing non-private method's parameter names at run-time"
DESCRIPTION = "Paranamer is a Java library that allows the parameter names of non-private \
methods and constructors to be accessed at run-time. Most compilers discard \
this information; traditional Reflection on JDK <= 7 would show something like \
doSomething(mypackage.Person ???) instead of doSomething(mypackage.Person toMe). \
The Paranamer library fills this gap for these JDK versions."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-2.8-2.11.noarch.rpm"
RPM_HASH = "934bedb55561f87989467c6ed1fa4e3105f4f31c8ff3457a9c65bc82e8f00850f5a776e6e775e715a989a92a3f3e4210f01b867c107aa80b246e8be62ecc09ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer \
mvn-com.thoughtworks.paranamer-paranamer-pom- \
osgi-com.thoughtworks.paranamer \
paranamer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
