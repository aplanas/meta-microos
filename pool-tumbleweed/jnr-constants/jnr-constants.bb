SUMMARY = "Java Native Runtime constants"
DESCRIPTION = "This project contains Java enums for common POSIX constants. It is \
predominately used to make calls into jnr-posix far simpler."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-0.10.4-2.1.noarch.rpm"
RPM_HASH = "e23934eb7da26cfe261215e39a064b424638dc97b7b48186fd51706bf49d1ee7749592b7feeba3943f412cd72e26bd5d09f7961ebf3bf889ebb9e1c203296808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-constants-pom- \
osgi-com.github.jnr.constants"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
