SUMMARY = "Documentation for the Regina REXX interpreter"
DESCRIPTION = "Documentation for both the Regina REXX interpreter and the REXX Utility \
Functions (regutil)."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "Regina-REXX-doc-3.9.1-6.10.aarch64.rpm"
RPM_HASH = "29f8fa37f546a6ec3391b4bd57a7a2fe875a38a9380ae384c755d938ebd3f0f42108d515915849acdacd5d15dad1746b74d8d7026c287073ae25f9295fb6f028"

RPROVIDES:${PN} += "Regina-REXX-doc"

RDEPENDS:${PN} += ""

inherit rpm
