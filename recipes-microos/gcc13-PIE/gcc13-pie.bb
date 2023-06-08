SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-PIE-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "75f4bc95e289e21596233f908c0a9af8a1ab52fb9d722fec8ed93b4d5362bf0b2cbaceb01f2eac5bcb21439cd75441f33262bd97563b812fce208e2801e98124"

RPROVIDES:${PN} += "gcc13-PIE gcc13-PIE(aarch-64)"
RDEPENDS:${PN} += "gcc13"

inherit rpm
