SUMMARY = "cangjie input schema for rime"
DESCRIPTION = "cangjie input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-cangjie-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "678d8f499e5ecf4572630eebf11933ae19cbcfce6869e2a95041ba5b1211b8ad7878752880199e43a4dc1f89e909ddcfe8d5a77348edeb585ffba1918141381b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cangjie"

RDEPENDS:${PN} += ""

inherit rpm
