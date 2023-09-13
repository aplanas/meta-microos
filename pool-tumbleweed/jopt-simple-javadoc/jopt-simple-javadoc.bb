SUMMARY = "Javadoc for jopt-simple"
DESCRIPTION = "This package contains the API documentation for jopt-simple."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-javadoc-5.0.4-2.1.noarch.rpm"
RPM_HASH = "109bf3cbba5b341707d77b230625f977a11939ddbd0d7e2af0adf30a321068d188eaac550008b34d7eb05e7506d7d461a32f09d8de3313249fde95ab4aebc188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
