SUMMARY = "Javadoc documentation for jsr-305"
DESCRIPTION = "This package contains the API documentation for jsr-305."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "jsr-305-javadoc-3.0.2-2.6.noarch.rpm"
RPM_HASH = "27f2d17481141aa43c95e3d4d418fc9f3c4d09628647cf63d8368dccd126045d437f0abad8c117b91d1bb51f1e94e30db3e25103ade2b5a2031a6c3ea6480e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-305-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
