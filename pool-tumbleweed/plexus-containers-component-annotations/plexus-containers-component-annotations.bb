SUMMARY = "Component API from plexus-containers"
DESCRIPTION = "Component API from plexus-containers."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-containers-component-annotations-2.1.1-4.1.noarch.rpm"
RPM_HASH = "63c44def1a5c691401511d78837324930460e76e8fc154c3813644b712b5cca98a214d966592f1aca07ec2c5e118caede82f4d2a5751fb1cb7abccf87705470b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-component-annotations-pom- \
osgi-org.codehaus.plexus.component-annotations \
plexus-containers-component-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
