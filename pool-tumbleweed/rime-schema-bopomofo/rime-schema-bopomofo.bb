SUMMARY = "bopomofo input schema for rime"
DESCRIPTION = "bopomofo input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-bopomofo-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "dfe8e7a17f642986a98f20f0ead25046864af12b3236639609c28d001f3f4f03eecafc4d9bc9d0d62571a36bb3705a132dcde64a9b54ba9fbd4c75d8429e83d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-bopomofo"

RDEPENDS:${PN} += ""

inherit rpm
