SUMMARY = "Thai table for Fcitx"
DESCRIPTION = "Fcitx Thai table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-thai-0.2.4-2.5.noarch.rpm"
RPM_HASH = "48adcf4cc4605fae101a41fdce6fa9993b9c28bd299c6d42d7c3476637f27853aae0c583294789128e0bc743ad3d53929f7b15d6fcb5e591dc723303797cc9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other \
fcitx-table-thai"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
