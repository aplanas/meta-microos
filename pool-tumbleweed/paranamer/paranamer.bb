SUMMARY = "Java library for accessing non-private method's parameter names at run-time"
DESCRIPTION = "Paranamer is a Java library that allows the parameter names of non-private \
methods and constructors to be accessed at run-time. Most compilers discard \
this information; traditional Reflection on JDK <= 7 would show something like \
doSomething(mypackage.Person ???) instead of doSomething(mypackage.Person toMe). \
The Paranamer library fills this gap for these JDK versions."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-2.8-3.1.noarch.rpm"
RPM_HASH = "505b4a0f7b024ca57f38747e0aadae46a4d85c33cc7329876210c4aecff30ec19058f75ba7f064b1d0099ab6f3079461af5604da56d1690d5db37114263b7ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer \
mvn-com.thoughtworks.paranamer-paranamer-pom- \
osgi-com.thoughtworks.paranamer \
paranamer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
