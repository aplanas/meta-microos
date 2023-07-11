SUMMARY = "Fish completion for exa"
DESCRIPTION = "Fish command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-fish-completion-0.10.1-3.5.noarch.rpm"
RPM_HASH = "de208d6b2fb9073def565f67803adefd693f04a114680653ab872f365e7edce71e047de7e52ce0b4bf7b456b2ac93e00585a473d7e470424e3e4d443f84388de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-fish-completion"

RDEPENDS:${PN} += "exa"

inherit rpm
