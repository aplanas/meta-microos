SUMMARY = "Several Lisp Files for GNU Emacs"
DESCRIPTION = "Several Lisp files not needed for running GNU Emacs. Most of these \
files are pre-byte compiled and therefore not necessary."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-el-28.2-4.3.noarch.rpm"
RPM_HASH = "0df0ae190d1b5139e37f2b41fea5f3ab6598cedc74d81ea8cb782e4f88bf2a1f69c05a62b7d344bba2a3bf776d32fbbd71e16d085b9cee18b600e6a843f71ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-devel \
emacs-el"

RDEPENDS:${PN} += "emacs"

inherit rpm
