SUMMARY = "Malayalam Compose table for Fcitx"
DESCRIPTION = "Fcitx Malayalam Compose table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-malayalam-compose-0.2.4-2.5.noarch.rpm"
RPM_HASH = "5a53123acb10b80a6025bbc16d53f48ddc7e15ee1f6625809271934f2eebb9f517bb33ef2a2fefd108b9a417cab2a530f94524441b9c5a51d631c1824aae320d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-malayalam-compose \
fcitx-table-other"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
