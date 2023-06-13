SUMMARY = "Java Native Runtime constants"
DESCRIPTION = "This project contains Java enums for common POSIX constants. It is \
predominately used to make calls into jnr-posix far simpler."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-0.10.4-1.1.noarch.rpm"
RPM_HASH = "c7b09359ec34abcb9e14f1b05fb01db6b1d11e51812b302632cab8ab3e3976d276de0a55ef17ec167bd42cc8b346bab22a55da75732d51aa32af4e3a17ae0c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants \
mvn(com.github.jnr:jnr-constants) \
mvn(com.github.jnr:jnr-constants:pom:) \
osgi(com.github.jnr.constants)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
