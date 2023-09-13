SUMMARY = "Class Model for Hk2"
DESCRIPTION = "Hundred Kilobytes Kernel Class Model."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-class-model-2.5.0-4.1.noarch.rpm"
RPM_HASH = "bd241c43d697b39e0b14b7677a1fd0fbb84271412d60cbea5c926f09f034dece013de4b5c52a0074dda1a464265a03b99738a0b47758f6bb0607eba79ba8bfb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-class-model \
mvn-org.glassfish.hk2-class-model \
mvn-org.glassfish.hk2-class-model-pom- \
osgi-org.glassfish.hk2.class-model"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm-all"

inherit rpm
