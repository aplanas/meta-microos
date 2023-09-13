SUMMARY = "Javadoc for felix-scr"
DESCRIPTION = "This package contains javadoc for felix-scr."
LICENSE = "Apache-2.0"

PV = "2.1.16"

RPM_NAME = "felix-scr-javadoc-2.1.16-2.1.noarch.rpm"
RPM_HASH = "36dfba8fb1bfd755a47dd9e0f3f02dd89b97c38c72252366c94bd499a849ecdb1053085aecdfe50e2c1485119936918c39ec3b6a787a201d56ba8f574f35fb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
