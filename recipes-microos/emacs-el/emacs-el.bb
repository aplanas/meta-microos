SUMMARY = "Several Lisp Files for GNU Emacs"
DESCRIPTION = "Several Lisp files not needed for running GNU Emacs. Most of these \
files are pre-byte compiled and therefore not necessary."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-el-28.2-4.2.noarch.rpm"
RPM_HASH = "85f7db3b3753e0c722ab823a4b670f658246dd327cb915358462f69f7a805939b3d16e15564dd69a7116d1e2155f4b84da9aa6ef5f3be205955080559f5d58c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-devel emacs-el"
RDEPENDS:${PN} += "emacs"

inherit rpm
