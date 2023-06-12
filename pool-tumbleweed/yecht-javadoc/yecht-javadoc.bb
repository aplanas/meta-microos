SUMMARY = "Javadocs for yecht"
DESCRIPTION = "This package contains the API documentation for yecht."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "yecht-javadoc-1.1-1.18.noarch.rpm"
RPM_HASH = "a36f9282f5733fe610110f1a901f332a5027aa2a14372c59613b9b1b1720b209990731264e3955a36dd1c7304058439feb04a9edeb7c2f156d82281b256b5d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yecht-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem \
jpackage-utils"

inherit rpm
