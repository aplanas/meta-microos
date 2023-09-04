SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-PIE-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "0cc2bdadff7cebaaea9a2543762a7a9284abf32b616f296b19496fd0377983cd0c68adefe1300a9e58e2af1779a55bbed879934d2f1ef97f8fc5718832603fd7"

RPROVIDES:${PN} += "gcc13-PIE"

RDEPENDS:${PN} += "gcc13"

inherit rpm
