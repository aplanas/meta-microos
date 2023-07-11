SUMMARY = "API documentation for maven-assembly-plugin"
DESCRIPTION = "This package provides API documentation for maven-assembly-plugin."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-assembly-plugin-javadoc-3.3.0-2.9.noarch.rpm"
RPM_HASH = "953fc25921015b3d098d0071a381f11bc02e888838b556941c3c19d2d1b460cf7b4b6e4ca2ff5d769ccd0e9481a65d40683220dc670a966e31c1d289de361006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
