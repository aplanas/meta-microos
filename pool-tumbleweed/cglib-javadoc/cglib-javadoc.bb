SUMMARY = "Code Generation Library"
DESCRIPTION = "cglib is a powerful, high performance and quality Code Generation \
Library, It is used to extend JAVA classes and implements interfaces at \
runtime."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "cglib-javadoc-3.3.0-4.4.noarch.rpm"
RPM_HASH = "1856a7c0703146af0f741f05c3783029f782735fa93a00e81a76bb993fde7e7db39a1401f2464a9ab18e43ab21fca2b99b1c84e241f9a40630e11f95df2551a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
