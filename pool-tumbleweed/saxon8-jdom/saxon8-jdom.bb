SUMMARY = "JDOM support for saxon8"
DESCRIPTION = "Provides additional classes enabling Saxon to be used with JDOM trees. \
Supports using a JDOM document as the input or output of \
transformations and queries. Requires jdom.jar on the classpath."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-jdom-B.8.8-133.6.noarch.rpm"
RPM_HASH = "8764b8e9077bfca28d076524f4cf672ffad6cece7312c6f027ba666b02844c9a62b33682d943afcf6a582a4af842e8ca60891e023e38f1b8eafcc85e94c765b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-jdom"

RDEPENDS:${PN} += "jdom \
saxon8"

inherit rpm
