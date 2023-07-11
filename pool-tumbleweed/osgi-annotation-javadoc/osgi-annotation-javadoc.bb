SUMMARY = "API documentation for osgi-annotation"
DESCRIPTION = "This package contains the API documentation for osgi-annotation."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-annotation-javadoc-7.0.0-3.5.noarch.rpm"
RPM_HASH = "a4d7c6c9bc0a9dd54c23430e53e1b1974104854074c84f16271d058f566b4dd4ffdd5b09ef2676653044ba4b950f17f1e46dc21279dbd5a3125ddb98407a8b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-annotation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
