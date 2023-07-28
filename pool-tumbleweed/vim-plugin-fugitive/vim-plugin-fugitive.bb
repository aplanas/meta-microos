SUMMARY = "Fugitive plugin for Vim"
DESCRIPTION = "Provides git integration with vim."
LICENSE = "Vim"

PV = "3.7"

RPM_NAME = "vim-plugin-fugitive-3.7-56.1.noarch.rpm"
RPM_HASH = "170d8707fdce426b55e4dd3b7772edb2196b311dddffdf3fc38889ed8b72e74aa17c99572ecff4f4f8191f604a022e3b640b80f14f8d451929447372a7a5b2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-fugitive"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core"

inherit rpm
