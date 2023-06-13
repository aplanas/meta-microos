SUMMARY = "XOM support for saxon8"
DESCRIPTION = "Provides additional classes enabling Saxon to be used with XOM trees. \
Supports using a XOM document as the input or output of transformations \
and queries. Requires xom.jar on the classpath."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-xom-B.8.8-133.6.noarch.rpm"
RPM_HASH = "ef2c108b50f83677040c61730f18abf3b6897c9bba908b0e9ab534a10e1c7932c22c30b742d6254f499e7ea2e912ec1771bf0ae1d2b8a713b726c4014472926b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-xom"

RDEPENDS:${PN} += "saxon8 \
xom"

inherit rpm
