SUMMARY = "The so-called 'easy' input method for Chinese"
DESCRIPTION = "Easy phrase-wise input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-easy-1.8.12-1.1.noarch.rpm"
RPM_HASH = "de0247a6b8cb68ebb7b35e7d9a31c2a159b1b144265987c77d91332f5c308858d93a06ee0b334df9999c83cd32596ab80854f5c1335fd02f20377ccfc0e180c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-easy \
ibus-table-easy \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
