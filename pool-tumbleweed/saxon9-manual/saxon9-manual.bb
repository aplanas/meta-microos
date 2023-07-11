SUMMARY = "Manual for saxon9"
DESCRIPTION = "Manual for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-manual-9.4.0.7-16.7.noarch.rpm"
RPM_HASH = "230d609fd2aa130fdafafc04faa3d04d7197840b1f91e93fd40869c7f2d5cc9e4907cefc4dd7070066f50db255e151e670bbf44e2f9d0e35c9cc1281933ce0f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-manual"

RDEPENDS:${PN} += ""

inherit rpm
