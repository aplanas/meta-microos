SUMMARY = "Fish Completion for hut"
DESCRIPTION = "The official fish completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-fish-completion-0.3.0-1.2.noarch.rpm"
RPM_HASH = "52d90ee9255045d6f25000c3e791c2e7be98755c7794acf249f602ded4d1194aae83326f3f965ee5fbb97d4f8f4b4072e7b13a7e8d7217ecda5221f17558a342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
