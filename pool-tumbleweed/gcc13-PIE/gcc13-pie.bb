SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-PIE-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "0b3d99ca084f53e34b8ebda22e08e0b3adab93b6bf04b30d4b0ee915e89afe13a80fee64fce4410b82f7415319b86e1646a60b861adbcf3cb2d6651f0f8d7258"

RPROVIDES:${PN} += "gcc13-PIE"

RDEPENDS:${PN} += "gcc13"

inherit rpm
