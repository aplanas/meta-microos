SUMMARY = "Package provides recommended R-codetools"
DESCRIPTION = "This packages provides R-codetools, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.2.19"

RPM_NAME = "R-codetools-0.2.19-45.2.aarch64.rpm"
RPM_HASH = "62a8608b45a28326e97fa28492f62ba705677583e283c3d9c27bf64c91941e9aa7919d5337138584eff55b3b8f2ef6a57c783036f091260bee12e8adfe98db59"

RPROVIDES:${PN} += "R-codetools \
R-codetools(aarch-64)"
RDEPENDS:${PN} += "R-base"

inherit rpm
