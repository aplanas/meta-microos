SUMMARY = "Emacs-based e-mail client based on the mu e-mail indexer/searcher"
DESCRIPTION = "mu4e is an emacs-based e-mail client. It is based on the mu e-mail indexer/searcher."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.3"

RPM_NAME = "mu4e-1.10.3-1.1.noarch.rpm"
RPM_HASH = "c642c085eef38c8e5d622778ef1d2f11980bbee3a55e2e011a51e0e612f93fd7eb47a72572f0e0528c7c375fbf29a3f2478544324bc881a6d27a69270a655cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mu4e"

RDEPENDS:${PN} += "/usr/bin/sh \
maildir-utils"

inherit rpm
