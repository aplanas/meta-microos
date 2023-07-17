SUMMARY = "A default configuration to build all binaries in PIE mode"
DESCRIPTION = "This package contains a configuration file (spec) that changes the \
compilers default setting to build all ELF binaries in the Position \
Independend Executable (PIE) variant. This enables better address \
space randomization (ASLR)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-PIE-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "9759f2a43d356366bfffedde3272f02d91e33688f71cab598027dcd6e368263dbd8a2beb9035f927da02ae82f0b9b39fd6cfc7f8420368eec07773097878e4ee"

RPROVIDES:${PN} += "gcc13-PIE"

RDEPENDS:${PN} += "gcc13"

inherit rpm
