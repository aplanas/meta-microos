SUMMARY = "Istack-commons runtime"
DESCRIPTION = "This package contains istack-commons runtime."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-runtime-3.0.7-4.5.noarch.rpm"
RPM_HASH = "34eb1e454df00748bd615baedc5ac6ad8d608e7bb3f208d1122a7b7a15f334b7021236b9880dd5a90c23c19f9a03d56f120c4af6a0e73496d0ed8e0efdfc809f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-runtime \
mvn-com.sun.istack-istack-commons-runtime \
mvn-com.sun.istack-istack-commons-runtime-pom- \
osgi-com.sun.istack.commons-runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-javax.activation-api"

inherit rpm
