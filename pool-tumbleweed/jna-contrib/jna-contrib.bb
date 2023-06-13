SUMMARY = "Contrib for jna"
DESCRIPTION = "This package contains the contributed examples for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "jna-contrib-5.5.0-3.6.noarch.rpm"
RPM_HASH = "4f078e2936ca70c0bb665003d25bd24cf8599c2d04026a3ec55adc9d684b58d42e1f96062c851a17b9c2b0de929d30fee9dd2a4cfcb3887345166abde4c0c84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-contrib \
mvn(net.java.dev.jna:jna-platform) \
mvn(net.java.dev.jna:jna-platform:pom:) \
mvn(net.java.dev.jna:platform) \
mvn(net.java.dev.jna:platform:pom:) \
osgi(com.sun.jna.platform)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jna \
mvn(net.java.dev.jna:jna) \
osgi(com.sun.jna)"

inherit rpm
