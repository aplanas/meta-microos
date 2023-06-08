SUMMARY = "Javadoc for ant-contrib"
DESCRIPTION = "Api documentation for ant-contrib."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-javadoc-1.0b3-10.3.noarch.rpm"
RPM_HASH = "92e83188d41cd81097194a87ed22571c3c28f3782488db36cc15b5735f0b7462ecfa085d634ef754b407f1af8ba36baf36662a7324e031f34f8b222bd5fd9f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem jpackage-utils"

inherit rpm
