SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-PIE-13-1.5.aarch64.rpm"
RPM_HASH = "b0fa7a40429a6dd1c4414319e575ebc403f5d687168d2b74dc7857fe153c56c3a5697cc4a2e71ce3f7c85d925c8c2d83cc6f9a0f3789eeca3feb33cc9e3e91aa"

RPROVIDES:${PN} += "gcc-PIE"

RDEPENDS:${PN} += "gcc13-PIE"

inherit rpm
