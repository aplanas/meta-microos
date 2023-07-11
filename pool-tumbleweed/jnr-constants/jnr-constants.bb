SUMMARY = "Java Native Runtime constants"
DESCRIPTION = "This project contains Java enums for common POSIX constants. It is \
predominately used to make calls into jnr-posix far simpler."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-0.10.4-1.2.noarch.rpm"
RPM_HASH = "ca0dc1edfe596e7ddfc25f4f976380efb4bbb7fae4699257188129a7a8c35146a7c142a2e2f4558dc230c6c664718dbc0bd35eb96f6e4c920bfb93255e70b6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-constants-pom- \
osgi-com.github.jnr.constants"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
