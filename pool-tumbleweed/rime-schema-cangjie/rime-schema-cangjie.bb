SUMMARY = "cangjie input schema for rime"
DESCRIPTION = "cangjie input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-cangjie-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "9a35f662780df801c1bc740db7d205270c92ccf9609a53f085ce936ff3d3d6112b7d8e1c92fa243d5794017832fe8abd9982a3149a911e7276ae444b84255c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cangjie"

RDEPENDS:${PN} += ""

inherit rpm
