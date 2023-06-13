SUMMARY = "Jyutping input method"
DESCRIPTION = "ibus-table-jyutping provides the Jyutping input method on IBus Table under \
the IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-jyutping-1.8.12-1.1.noarch.rpm"
RPM_HASH = "7433f3f4a09e495ef99e8e68b557378735eef6efb03d2a339616f0b722e952d2884ffa886dcaa88f9f22fa6556aae5dcf6a450162bb717aea7f7b031bfa3e632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-jyutping \
ibus-table-jyutping \
locale(ibus:zh_TW;zh_HK)"

RDEPENDS:${PN} += "/bin/sh \
ibus-table"

inherit rpm
