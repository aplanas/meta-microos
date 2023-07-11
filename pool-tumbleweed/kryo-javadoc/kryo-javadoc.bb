SUMMARY = "Javadoc for kryo"
DESCRIPTION = "This package contains javadoc for kryo."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "kryo-javadoc-4.0.2-2.20.noarch.rpm"
RPM_HASH = "d230a8c7ee8491520301cd4dcad3ca723b01e7cc5d60ef70f6ff3faed4fc86434aac93c5d4380d25f3584ff82c67979bc247335df0f42601cdad8bddd11cff46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kryo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
