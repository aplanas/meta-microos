SUMMARY = "bopomofo input schema for rime"
DESCRIPTION = "bopomofo input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-bopomofo-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "19857ea8dd821e56cb4b1e89de8577f149516546aa29ea0390549292a5a32a2f9eaff85c61d431181d7ad8a57f00a6d61f6170e1efc8fa63326c5022479bcb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-bopomofo"

RDEPENDS:${PN} += ""

inherit rpm
