SUMMARY = "Pure Java implementation of libzmq"
DESCRIPTION = "Pure Java implementation of libzmq."
LICENSE = "MPL-2.0+"

PV = "0.5.2"

RPM_NAME = "jeromq-0.5.2-1.8.noarch.rpm"
RPM_HASH = "7ad866f939e51a56743b20a08246772cac9f86098d76c370ea81dc48ff84b957750cbce481622bc489ecb077815cbd6654116885ded92d65baa4c6684e954d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq \
mvn-org.zeromq-jeromq \
mvn-org.zeromq-jeromq-pom- \
osgi-org.zeromq.jeromq"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-eu.neilalexander-jnacl"

inherit rpm
