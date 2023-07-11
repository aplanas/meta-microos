SUMMARY = "Fish completion for khal"
DESCRIPTION = "Fish shell completions for khal"
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python-khal-fish-completion-0.10.5-3.5.noarch.rpm"
RPM_HASH = "62946be1d31babb3f899df8243b51cbe18801ecca8284719cd15dc98782face92fde0eaf101e649dc3651a73e2b4303290e1d2f57def2cf85f5a2779a7d0e348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
