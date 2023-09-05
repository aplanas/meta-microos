SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-PIE-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "5d4f53f0faa94d2db9b26f32491e0e1a1175519b2b88d8fc9136b5c9cb36fb66fb48dec9bb77c6a9d02fe08355b3cf62323c0983115c376851b677212dece3c8"

RPROVIDES:${PN} += "gcc13-PIE"

RDEPENDS:${PN} += "gcc13"

inherit rpm
