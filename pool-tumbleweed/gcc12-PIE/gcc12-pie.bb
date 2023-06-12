SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-PIE-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "7edef85e81a0349e07b59d665c0904142b7e8ecf01ea415f0971d210f20271a1f732aff82121ecb70943d3ee5adb30a71fd3d30ddfaec3c311e97e56c69e4a1d"

RPROVIDES:${PN} += "gcc12-PIE \
gcc12-PIE(aarch-64)"
RDEPENDS:${PN} += "gcc12"

inherit rpm
