SUMMARY = "Translit input method for IBus framework"
DESCRIPTION = "ibus-table-translit provides Translit input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-translit-1.3.16-1.1.noarch.rpm"
RPM_HASH = "ac6dcba1f800f5d7baac6aeff8db1c013112ddeddc70674d3642dbffb73c4ba35fcb6fc0716f581ff3f11bc9b9118c07492bceda84164bf44857519522070228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-translit \
locale-ibus-ru"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
