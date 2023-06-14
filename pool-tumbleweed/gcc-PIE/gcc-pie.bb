SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-PIE-13-1.3.aarch64.rpm"
RPM_HASH = "1197a3cbbe2b1f9e09ede453d9573d7922d6af8e736a890b19756029490b2325cc8bba6ea235b44c9f004acc1eac7e6bbc1b8bf2f54f2e56c3da03ff57f786b8"

RPROVIDES:${PN} += "gcc-PIE"

RDEPENDS:${PN} += "gcc13-PIE"

inherit rpm
