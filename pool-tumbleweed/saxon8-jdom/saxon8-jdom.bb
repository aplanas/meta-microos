SUMMARY = "JDOM support for saxon8"
DESCRIPTION = "Provides additional classes enabling Saxon to be used with JDOM trees. \
Supports using a JDOM document as the input or output of \
transformations and queries. Requires jdom.jar on the classpath."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-jdom-B.8.8-133.7.noarch.rpm"
RPM_HASH = "88bfb7aa5537851f9cc7b07c6b66ffa0ec1deb76ccd7c95c97f675948210e172596bb1aca23ce6be4c1faeaaf7ec60af067dce915fa6710b44fa65ae2fefb8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-jdom"

RDEPENDS:${PN} += "jdom \
saxon8"

inherit rpm
