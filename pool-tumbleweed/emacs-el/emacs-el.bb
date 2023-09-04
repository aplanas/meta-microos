SUMMARY = "Several Lisp Files for GNU Emacs"
DESCRIPTION = "Several Lisp files not needed for running GNU Emacs. Most of these \
files are pre-byte compiled and therefore not necessary."
LICENSE = "GPL-3.0-or-later"

PV = "29.1"

RPM_NAME = "emacs-el-29.1-3.1.noarch.rpm"
RPM_HASH = "2ecb60421bdffb2bd0e2237edc40708d36add85d07eb0ef9b1b37fdfeb6ec8cae1246c3a67ba8eb1d9f2150b22b40b60f202c70e3ecf279336acaff75ed55957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-devel \
emacs-el"

RDEPENDS:${PN} += "emacs"

inherit rpm
