SUMMARY = "Arabic table for Fcitx"
DESCRIPTION = "Fcitx Arabic table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-arabic-0.2.4-2.5.noarch.rpm"
RPM_HASH = "7d5a9cd934e9f33a16d88483931d1e2a3391c933f00907b322dca9ff210d1a75fa7a38264efebac5a7618951fed0f2df05f097c2c6a122ce7da6f4215bee4e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-arabic \
fcitx-table-other"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
