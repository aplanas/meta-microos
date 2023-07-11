SUMMARY = "OSGi Service Log"
DESCRIPTION = "OSGi Companion Code for org.osgi.service.log Version 1.5.0."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "osgi-service-log-1.5.0-1.4.noarch.rpm"
RPM_HASH = "858f8a9c6f5e3d74078112e06ba0ad320c7d0cdb6358ee8f2614ba639a23b63f6110afe63f45e45ec5e116517e2cae15b62f9f8ef40f378474c6d9d6170731b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.service.log \
mvn-org.osgi-org.osgi.service.log-pom- \
osgi-org.osgi.service.log \
osgi-service-log"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
