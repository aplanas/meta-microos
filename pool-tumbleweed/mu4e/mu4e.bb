SUMMARY = "Emacs-based e-mail client based on the mu e-mail indexer/searcher"
DESCRIPTION = "mu4e is an emacs-based e-mail client. It is based on the mu e-mail indexer/searcher."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.5"

RPM_NAME = "mu4e-1.10.5-1.1.noarch.rpm"
RPM_HASH = "826ed2e01397ab2acbfecf26979a4cbe37d76f2cdf0659a8ac8f4f4dab92ae5350b19975c3e967e9f02e17fd925be4945a93fa83d43c067d2cbbd4cc155ef5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mu4e"

RDEPENDS:${PN} += "/usr/bin/sh \
maildir-utils"

inherit rpm
