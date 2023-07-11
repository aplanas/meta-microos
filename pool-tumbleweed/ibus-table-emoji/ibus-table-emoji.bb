SUMMARY = "Emoji input method for IBus framework"
DESCRIPTION = "ibus-table-emoji provides Emoji input method on IBus Table under IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-emoji-1.3.16-1.1.noarch.rpm"
RPM_HASH = "8d4aee320ed95b0c42ec1849b286a258ffc18f0c1ecc35f4caf6701bb783dcb0e246ce19b4b09975790ef16cfb62673510d72d7dceb4b7f50a92c0925a25aa01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-emoji"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
