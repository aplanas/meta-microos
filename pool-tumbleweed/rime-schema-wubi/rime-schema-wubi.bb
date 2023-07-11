SUMMARY = "wubi input schema for rime"
DESCRIPTION = "wubi input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-wubi-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "d117ad5ac487915c136b2c791710925c0402cc93843d65695e62eb6cba24498672822f065b62dd5c8934493860c0cab175d75fb8d14e561cad54055a3fb4710e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wubi"

RDEPENDS:${PN} += ""

inherit rpm
