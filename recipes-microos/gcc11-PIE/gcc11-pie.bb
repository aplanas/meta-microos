SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-PIE-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "1085007ed024add30174900452c743a473de7782d3656bfb4131347d754903f3a210c8c3610c81b6ea86f6f42656d2c0a10fde20f881737c539fc83384182161"

RPROVIDES:${PN} += "gcc11-PIE gcc11-PIE(aarch-64)"
RDEPENDS:${PN} += "gcc11"

inherit rpm
