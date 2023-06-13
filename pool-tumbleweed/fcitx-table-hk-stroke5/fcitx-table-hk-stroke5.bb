SUMMARY = "Hong Kong 5 stroke input table for Fcitx"
DESCRIPTION = "Fcitx Hong Kong 5 stroke input table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-hk-stroke5-0.3.8-2.5.noarch.rpm"
RPM_HASH = "7341147c8ddafc31a6e83ec470dcdf0a6c0febbbb0e2462ace3eb60e4f6bae35f66eed54d5b74cac21cdb0255e5c88f607630c77bec35daae1d92450729aaef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-hk-stroke5"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
