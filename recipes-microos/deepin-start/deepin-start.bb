SUMMARY = "Starter of deepin desktop"
DESCRIPTION = "deepin-start is used for launching DDE components and invoking user's \
custom applications which compliant with xdg autostart specification."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "deepin-start-5.9.49-2.3.aarch64.rpm"
RPM_HASH = "6b9534fb042fa4e21e72050da65c782bf6946a870cf629899620df2dc0dd44897df009b449f17cd3532549d73034b8d6602311113d34067fa867b8ff054132d0"

RPROVIDES:${PN} += "deepin-start deepin-start(aarch-64) startdde"
RDEPENDS:${PN} += "/bin/sh deepin-daemon update-alternatives"

inherit rpm
