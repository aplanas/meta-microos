SUMMARY = "Emoji table for Fcitx"
DESCRIPTION = "Fcitx Emoji (Emoticons) table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-emoji-0.2.4-2.5.noarch.rpm"
RPM_HASH = "efe41aab99096b6fca8d2d360d45d21a286737f575195be79fd19e28cf0df0a6cbe0fc2a7d665a68151b5d3e5ca55a9428f77658f31ac26acf001f8f4b3e93a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-emoji fcitx-table-other"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
