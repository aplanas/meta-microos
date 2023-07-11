SUMMARY = "All rime input schemas"
DESCRIPTION = "All rime input schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-all-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "3491f36cfb05a579d64b8c5bca3bac6f022d089aeea6082a3b9137e0086afba1dd9a1853bc6fc1b4cf0ad157c86ecd68598337bab519e5badcdb0f150392253e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brise \
rime-schema-all"

RDEPENDS:${PN} += "rime-schema-default \
rime-schema-extra"

inherit rpm
