SUMMARY = "T9 table for Fcitx"
DESCRIPTION = "Fcitx T9 table."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-t9-0.3.8-2.5.noarch.rpm"
RPM_HASH = "7ed2b8e2b74626a6bb8c8e7793cc2fb4fbc67c88f5a50243bc8cd2e5b7ad086b3f5dc81e6343685b1d40c2e96d403a36466be7fb4dd623234dd001a399cce6bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-t9"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
