SUMMARY = "Header Files Required for Developing Plugins for pppd"
DESCRIPTION = "The package ppp-devel contains C header files required for developing \
plugins for the pppd."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ppp-devel-2.4.9-3.3.aarch64.rpm"
RPM_HASH = "a43664fa31826f7a1c6feb54ee37667ea953b9a64b911c86d8708a8926e837f09bfc39388a06e47c03d985884b66454859ed60827bc998e48a7dc78af9a029fd"

RPROVIDES:${PN} += "ppp-devel"

RDEPENDS:${PN} += "ppp"

inherit rpm
