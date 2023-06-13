SUMMARY = "The so-called 'Quick-to-learn' input methods for Chinese"
DESCRIPTION = "Quick-to-learn is based on the Cangjie input method, \
but only needs Cangjie's first and last word-root \
to form a character. \
 \
Includes: \
Quick3, Quick5 and Quick-Classic, \
and Smart Cangjie 6."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-quick-1.8.12-1.1.noarch.rpm"
RPM_HASH = "c89e314a567143e8267f1a419611441784d028e24bba9e26f06348adc5bb9dd2854f477d4d10e886dac3b9735bfcb02da853564e2239350d1ae5d730d180d44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-quick \
ibus-table-quick \
locale(ibus:zh_TW;zh_HK)"

RDEPENDS:${PN} += "/bin/sh \
ibus-table"

inherit rpm
