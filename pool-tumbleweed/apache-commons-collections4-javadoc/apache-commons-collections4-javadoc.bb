SUMMARY = "API documentation for apache-commons-collections4"
DESCRIPTION = "This package provides API documentation for apache-commons-collections4."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "apache-commons-collections4-javadoc-4.1-2.6.noarch.rpm"
RPM_HASH = "35943de0ed347f22d7932257b75db69e92b52c90ac64890869cdc5141f0759b440f114bdcbe89291d69620864831763ebef6c22d40ad145a451df1eaafb705a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections4-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
