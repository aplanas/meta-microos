SUMMARY = "Translit-ua input method for IBus framework"
DESCRIPTION = "ibus-table-translit-ua provides Translit-ua input method on IBus Table under \
IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-translit-ua-1.3.16-1.1.noarch.rpm"
RPM_HASH = "8eab4545f0cac14ce099b29c8cf8b02209df371e5e99c361627692427c8fd042ad7d2588c270660972d33870882f06074a0e9adab1beea314358e1b428321ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-translit-ua \
locale-ibus-uk"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
