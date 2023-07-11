SUMMARY = "API documentation for maven-mapping"
DESCRIPTION = "This package provides API documentation for maven-mapping."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-mapping-javadoc-3.0.0-3.11.noarch.rpm"
RPM_HASH = "4b770e6ae926cc0bcec084d4a788c01ca4b97951a13f11ccb98d94dc2558ad13a87b27e77aa1acf7cd350fc2b762b4012800be41729754fb0d19dbe56c3bc055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-mapping-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
