SUMMARY = "Fish completion for exa"
DESCRIPTION = "Fish command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-fish-completion-0.10.1-3.6.noarch.rpm"
RPM_HASH = "da935eb199a6c5b39ea5c24e6c9b87a1741998280427b94e622fc663ca1db9f227eac0ef50b58dc6b0ddf43704db85d8c3a41b6b092f1345b801af497140c1f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-fish-completion"

RDEPENDS:${PN} += "exa"

inherit rpm
