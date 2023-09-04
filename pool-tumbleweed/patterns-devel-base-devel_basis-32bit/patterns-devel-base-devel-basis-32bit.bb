SUMMARY = "Base Development"
DESCRIPTION = "The 32bit pattern complementing devel_basis."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_basis-32bit-20170319-12.1.aarch64.rpm"
RPM_HASH = "1e0f9879358fece6913c66c3f36e76fb33f7df5910efdd63d495906d305600b4619b6ae1bc279675eee0e4fe0b7082c04f21ff74e9305336f1d5bacb592e25ec"

RPROVIDES:${PN} += "pattern- \
patterns-devel-base-devel-basis-32bit"

RDEPENDS:${PN} += ""

inherit rpm
