SUMMARY = "Emacs-based e-mail client based on the mu e-mail indexer/searcher"
DESCRIPTION = "mu4e is an emacs-based e-mail client. It is based on the mu e-mail indexer/searcher."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.7"

RPM_NAME = "mu4e-1.10.7-1.1.noarch.rpm"
RPM_HASH = "3c98c071672e693dae7ed1418a28f6c1c46a664a6921ea6ac68310ed8bd40ff35f593f658ea9bb5b8b5b829f8ca86669829ad8b530d2b863bae60bb55c509cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mu4e"

RDEPENDS:${PN} += "/usr/bin/sh \
maildir-utils"

inherit rpm
