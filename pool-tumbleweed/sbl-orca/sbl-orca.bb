SUMMARY = "brld-orca brlapi"
DESCRIPTION = "this python module enables orca to use brld for braille output"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.5.0.20130317.git7a75bc29"

RPM_NAME = "sbl-orca-3.5.0.20130317.git7a75bc29-6.15.aarch64.rpm"
RPM_HASH = "7201782e98da615c45eff668e96273af1e3f4b1587bfc93b4c399ace479978c3f5bfbdb76698f78f78169a8f2ea921e6aa5e876aed519e6d218d44c827332c6e"

RPROVIDES:${PN} += "sbl-orca"

RDEPENDS:${PN} += "orca \
python-abi"

inherit rpm
