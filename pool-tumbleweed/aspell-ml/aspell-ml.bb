SUMMARY = "Malayalam (മലയാളം) Dictionary for Aspell"
DESCRIPTION = "A Malayalam (മലയാളം) dictionary for the aspell spell checker."
LICENSE = "GPL-3.0-or-later"

PV = "0.03"

RPM_NAME = "aspell-ml-0.03-2.14.aarch64.rpm"
RPM_HASH = "e701bb2a3dd815ff61671747f46dd6322ab89f4ff25853298c499622971858c129a32036078b79b41f185c4ff6490ddefa34289f1134558ea3a3c349080ed1db"

RPROVIDES:${PN} += "aspell-ml \
locale-aspell-ml"

RDEPENDS:${PN} += ""

inherit rpm
