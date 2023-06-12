SUMMARY = "Vni table for ibus-table"
DESCRIPTION = "ibus-table-mongol-bichig provides the Vietnamese Vni table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-vni-1.3.13-2.3.noarch.rpm"
RPM_HASH = "100a85876df52102a5bafde019df298c43515f93c0745d627bff0b1e67193f7766244befe963213c66d4887bdd1c878058580d519a14871a9cb0284dc89c93d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-vni"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
