SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-PIE-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "53a3e1cbd288eb27a68593b19b72bf43993e2755502456941d4d585da7f1ba907a57827e9fdcab2ea23a4ecd9b717629a6a2ce93538fb65f3bc9a335e98b82b4"

RPROVIDES:${PN} += "gcc13-PIE"

RDEPENDS:${PN} += "gcc13"

inherit rpm
