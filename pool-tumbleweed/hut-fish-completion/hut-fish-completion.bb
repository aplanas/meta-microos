SUMMARY = "Fish Completion for hut"
DESCRIPTION = "The official fish completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-fish-completion-0.3.0-1.3.noarch.rpm"
RPM_HASH = "201ee36beda1d4407446ff77d27bb7979a60bf5476dc9a8d954048c0f2880d72b12227848801ef96534395086c17ee9c3e1e924aea969bf1164bb75c94b9fad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
