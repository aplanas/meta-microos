SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.33.6"

RPM_NAME = "chezmoi-bash-completion-2.33.6-1.1.noarch.rpm"
RPM_HASH = "736673be860619b1325e0101a608b4b8ff329955991e3df4a6e6906e3f0fec673b7e8249689c5dbc01b85d1432c7da69f9917c1d1cc4282a46f36457800e0e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
