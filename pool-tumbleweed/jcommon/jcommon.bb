SUMMARY = "Common library"
DESCRIPTION = "Collection of classes used by Object Refinery Projects, for example \
jfreechart"
LICENSE = "LGPL-2.1-only"

PV = "1.0.24"

RPM_NAME = "jcommon-1.0.24-2.7.noarch.rpm"
RPM_HASH = "789715d463a30e60736e125fa537e48d1726a20c22d41541c03661367990568ed7e666206dbc6c2b9053697ef1783f23fa6f58d9e3eca793149060affa71a6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcommon \
mvn-org.jfree-jcommon \
mvn-org.jfree-jcommon-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
