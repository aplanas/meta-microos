SUMMARY = "Boshiamy table for Fcitx"
DESCRIPTION = "Fcitx Boshiamy table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-boshiamy-0.3.8-2.5.noarch.rpm"
RPM_HASH = "7495a9be41ee18865d32a9dbfb429fc76d69a8cc01fac370b792921d89d6608756095c0959a7a1f8bd8a7f872305537a602dc6687be0f3329e5dee8c2b241632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra fcitx-table-tw-boshiamy locale(fcitx-table:zh_TW;)"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
