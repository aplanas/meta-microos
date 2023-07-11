SUMMARY = "KIWI - manual pages"
DESCRIPTION = "Provides manual pages to describe the kiwi commands"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-man-pages-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "d74fb2006f1d5da0123a9f335b739c03a17e667ceb9b6b0acaf9b0c0f822b91de654afe166c373be4a8a5c8aa24b1b819f8e33137c8e123bc76b887ee3a3d92e"

RPROVIDES:${PN} += "config-kiwi-man-pages \
kiwi-man-pages"

RDEPENDS:${PN} += ""

inherit rpm
