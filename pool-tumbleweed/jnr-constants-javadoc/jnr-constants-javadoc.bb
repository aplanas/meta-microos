SUMMARY = "Javadocs for jnr-constants"
DESCRIPTION = "This package contains the API documentation for jnr-constants."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-javadoc-0.10.4-1.1.noarch.rpm"
RPM_HASH = "ea2cff2312b871dc290858bf41bd33ad9bbb5846e1615127354975afd45551d8d781d2c4c73020bd26ec35db4f774087ca9c19cf01d570ddf0a766337d77a486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
