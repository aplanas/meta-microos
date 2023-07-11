SUMMARY = "XOM support for saxon8"
DESCRIPTION = "Provides additional classes enabling Saxon to be used with XOM trees. \
Supports using a XOM document as the input or output of transformations \
and queries. Requires xom.jar on the classpath."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-xom-B.8.8-133.7.noarch.rpm"
RPM_HASH = "47347c0bfc692ca78f27c9b71291980b5f7500181c8524f57fe9f95de84b0f3dff397f341b62ece493c7503596f113a086eab342696e3b1f94d89ed9a44dfe0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-xom"

RDEPENDS:${PN} += "saxon8 \
xom"

inherit rpm
