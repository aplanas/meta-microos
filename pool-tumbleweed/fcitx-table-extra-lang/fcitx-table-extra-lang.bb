SUMMARY = "Languages for package fcitx-table-extra"
DESCRIPTION = "Provides translations to the package fcitx-table-extra"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-extra-lang-0.3.8-2.5.noarch.rpm"
RPM_HASH = "e4743ca983f9f5dece852ebb01f016ed33e352c30e477efe54697f7855e93b883a42c76c76ab0d23cddf3335b6c2ee6d277c8d7b257dbc81d384daf758a88c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra-lang \
fcitx-table-extra-lang-all \
locale(fcitx-table-extra:ca) \
locale(fcitx-table-extra:da) \
locale(fcitx-table-extra:de) \
locale(fcitx-table-extra:ja) \
locale(fcitx-table-extra:ko) \
locale(fcitx-table-extra:ru) \
locale(fcitx-table-extra:tr) \
locale(fcitx-table-extra:zh_CN) \
locale(fcitx-table-extra:zh_TW)"

RDEPENDS:${PN} += "fcitx-table-extra"

inherit rpm
