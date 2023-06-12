SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-PIE-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "1db60d973a26567f87c108d05d14d9192a8518bed628be2b3d112b827b2382fc4b2f40c8d20bb57707702e3ebb42f450146c766f1128a6f66ed7daf6013db3a5"

RPROVIDES:${PN} += "gcc13-PIE \
gcc13-PIE(aarch-64)"
RDEPENDS:${PN} += "gcc13"

inherit rpm
