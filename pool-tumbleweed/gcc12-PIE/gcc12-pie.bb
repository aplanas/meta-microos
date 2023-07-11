SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-PIE-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "c45177475b0aa5c8118a5aace1e8f8894feb334ba15f869939cd2bd0923eb8c34ffd033632121aea7a8a0026cb77a1506279cfae6829a65d618fe3b39425b30a"

RPROVIDES:${PN} += "gcc12-PIE"

RDEPENDS:${PN} += "gcc12"

inherit rpm
