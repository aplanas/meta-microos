SUMMARY = "Pure Java implementation of libzmq"
DESCRIPTION = "Pure Java implementation of libzmq."
LICENSE = "MPL-2.0+"

PV = "0.5.2"

RPM_NAME = "jeromq-0.5.2-2.1.noarch.rpm"
RPM_HASH = "ae99967df21b57365a85aaf5178f1731a339ca13982dc6d4a4449cac2f28a625af941b355d71a02900cb9a2b9eb3ac06de7a86f6d98b05e49b74098cc272cf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq \
mvn-org.zeromq-jeromq \
mvn-org.zeromq-jeromq-pom- \
osgi-org.zeromq.jeromq"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-eu.neilalexander-jnacl"

inherit rpm
