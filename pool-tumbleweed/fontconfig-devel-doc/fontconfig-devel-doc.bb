SUMMARY = "Developer documentation for libfontconfig"
DESCRIPTION = "HTML documentation and manual pages for developers using the \
fontconfig library."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-devel-doc-2.14.2-1.3.noarch.rpm"
RPM_HASH = "d55d93989fb87b71ea035ae9cb2dae2e0db71e128d7a107e2152b6b82ab6b2f2c4d07398869daececd92689b6c4262645cb7b4cab923093d96c91039ab9921a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
