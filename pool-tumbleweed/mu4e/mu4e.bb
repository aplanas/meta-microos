SUMMARY = "Emacs-based e-mail client based on the mu e-mail indexer/searcher"
DESCRIPTION = "mu4e is an emacs-based e-mail client. It is based on the mu e-mail indexer/searcher."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.4"

RPM_NAME = "mu4e-1.10.4-1.1.noarch.rpm"
RPM_HASH = "3cf6a0a993aa71172380c31c7f5106fa5a75769e4d03df85bdb45633a3b71d3e4abc7550f14c90c6319b129674ffc6cd9b31e156ed20f4a0607a4da0e6f7878b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mu4e"

RDEPENDS:${PN} += "/usr/bin/sh \
maildir-utils"

inherit rpm
