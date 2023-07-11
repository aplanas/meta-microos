SUMMARY = "Component API from plexus-containers"
DESCRIPTION = "Component API from plexus-containers."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-containers-component-annotations-2.1.1-4.2.noarch.rpm"
RPM_HASH = "f6be2d517a7fca99f33eb79390117b15336bc7647dcf6186d845384b0e240b8499ecfd5057342a5989da412f42046f22dd9140c5f3fa1d2dfe0186e43c13593d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-component-annotations-pom- \
osgi-org.codehaus.plexus.component-annotations \
plexus-containers-component-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
