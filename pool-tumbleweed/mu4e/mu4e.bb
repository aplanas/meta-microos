SUMMARY = "Emacs-based e-mail client based on the mu e-mail indexer/searcher"
DESCRIPTION = "mu4e is an emacs-based e-mail client. It is based on the mu e-mail indexer/searcher."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.6"

RPM_NAME = "mu4e-1.10.6-1.1.noarch.rpm"
RPM_HASH = "64a3f8446ba8f48f5db2dd84f62810624abdf9be56de0a965fae808f6d4be222e11083a95117cc5dad5aecd5e308e8183c90226ce08c58ee3881a8e6b15bc715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mu4e"

RDEPENDS:${PN} += "/usr/bin/sh \
maildir-utils"

inherit rpm
