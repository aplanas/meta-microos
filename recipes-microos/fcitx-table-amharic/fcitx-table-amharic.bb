SUMMARY = "Amharic table for Fcitx"
DESCRIPTION = "Fcitx Amharic table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-amharic-0.2.4-2.5.noarch.rpm"
RPM_HASH = "1a8e0dc676b0bff310e7a2481e4fbdf3010376550d2b24c482d71b634fa83554e2134c6e9f3673d34d05da76c078eb55d4aee5c40b0ed721ca47de4be7d974a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-amharic \
fcitx-table-other"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
