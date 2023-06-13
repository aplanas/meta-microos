SUMMARY = "Cheng large character set table for Fcitx"
DESCRIPTION = "Fcitx Cheng (Zheng Ma) table with large character set \
for Simplified Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-cn-zhengma-large-0.3.8-2.5.noarch.rpm"
RPM_HASH = "3ccb6ab9f19c3bafa252043fb1274a8f95c9fb298d3c437c9b80cc4bc9adcefff8fa2670ccf62816c6236dddc1419bc04655cab528e495a5b59e7cc66f91e60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-zhengma-large \
fcitx-table-extra"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
