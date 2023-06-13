SUMMARY = "Javadoc for lightcouch"
DESCRIPTION = "This package contains javadoc for lightcouch."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "lightcouch-javadoc-0.2.0-1.7.noarch.rpm"
RPM_HASH = "1af3f7e5426ca361f1abdda7359e9bcb620f07d9156b5e72038a89f4427b63817cc8b52bc276bd6fb800a2cbdae48597bd75442213d50d9298213a3236676cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightcouch-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
