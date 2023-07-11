SUMMARY = "Javadoc for easymock"
DESCRIPTION = "Javadoc for easymock."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "easymock-javadoc-3.6-2.25.noarch.rpm"
RPM_HASH = "612a7de0dd7c516d1ed779002ed69c4602524ce058d55a4fd6530b85c2d5cfa0d34a83fbaa85292b7ac9988427484f20905bc0803a725d144877ffa65b6029aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easymock-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
