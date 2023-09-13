SUMMARY = "Javadoc for unit-api"
DESCRIPTION = "This package contains javadoc for unit-api."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "unit-api-javadoc-1.0-2.1.noarch.rpm"
RPM_HASH = "58fb0aa907509442037d7fbba7283fa6fd36dfbd9144f0c5569f9261fa6678f368b737eb7bb718a8241bb1722f5b0b0732ed868e9c801aec9ea914127d294f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unit-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
