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

RPM_NAME = "plexus-classworlds-2.6.0-1.5.noarch.rpm"
RPM_HASH = "fecfd81080274c517eabe740ccbf3ff41d58772d59ec9f9d24e9bbabacde68ba78c2ba20c96372032c54126a18f8faf1726b476587d91aede70e6e5392632d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "classworlds \
mvn-classworlds-classworlds \
mvn-classworlds-classworlds-pom- \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-classworlds-pom- \
osgi-org.codehaus.plexus.classworlds \
plexus-classworlds"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
