SUMMARY = "Documents and examples for systemtap"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the documents and examples for systemtap."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-docs-4.9-1.1.noarch.rpm"
RPM_HASH = "bd95d6bc1c654d62b4005c1338e4ad7756b61cc315434ea378878a0b65a8f37d70d5108251c2afd25fb938a2a50c8631bb7aa172064872d373f66db014003446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemtap-docs"

RDEPENDS:${PN} += ""

inherit rpm
