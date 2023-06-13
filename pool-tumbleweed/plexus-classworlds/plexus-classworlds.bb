SUMMARY = "Plexus Classworlds Classloader Framework"
DESCRIPTION = "Classworlds is a framework for container developers \
who require complex manipulation of Java's ClassLoaders. \
Java's native ClassLoader mechanisms and classes can cause \
much headache and confusion for certain types of \
application developers. Projects which involve dynamic \
loading of components or otherwise represent a 'container' \
can benefit from the classloading control provided by \
classworlds."
LICENSE = "Apache-2.0 & Plexus"

PV = "2.6.0"

RPM_NAME = "plexus-classworlds-2.6.0-1.4.noarch.rpm"
RPM_HASH = "b1797bf0ed1c700d3c13fdd526c9c6985298287ccdd26374bdabc64c0728276478b9bf7c528cca1f10a756b3c38c726637091e9dee27c479187248336abdf2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "classworlds \
mvn(classworlds:classworlds) \
mvn(classworlds:classworlds:pom:) \
mvn(org.codehaus.plexus:plexus-classworlds) \
mvn(org.codehaus.plexus:plexus-classworlds:pom:) \
osgi(org.codehaus.plexus.classworlds) \
plexus-classworlds"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
