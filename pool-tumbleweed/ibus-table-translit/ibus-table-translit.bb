SUMMARY = "Translit input method for IBus framework"
DESCRIPTION = "ibus-table-translit provides Translit input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-translit-1.3.13-2.3.noarch.rpm"
RPM_HASH = "592b22b99fc4b0e3f10d085c6efff4173a072b7aa9f56d32cb8b6bd9720df978276464655de397768dc1b75f1c0175a9da2721fdfe92520a37f6cae37817393f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-translit \
locale-ibus-ru"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
