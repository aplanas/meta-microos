SUMMARY = "AUC TeX: An Emacs Extension"
DESCRIPTION = "These macros make it easier for you to write TeX documents with GNU \
Emacs.	Documentation can be found under: \
 \
/usr/share/doc/packages/emacs-auctex/ \
 \
and in the dvi files math-ref.dvi and tex-ref.dvi (reference cards) and \
in the info file auctex in emacs info-mode. \
 \
AuC TeX is integrated in XEmacs 19.15 and higher, so these packages may \
not be installed concurrently.	Note that the binary formats of the \
byte-compiled lisp files of the two emacs editors are incompatible, so \
you cannot use this package for XEmacs."
LICENSE = "GPL-3.0-or-later"

PV = "13.2"

RPM_NAME = "emacs-auctex-13.2-1.1.noarch.rpm"
RPM_HASH = "13a70cf38c6bc0b91bf908df825be73ad2db54c50117fe1b8ea13c1ad5bf7d994df9d7bfc30c488a21e91550411c735ac60012564244ff63bb9b9534d9af59aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auc-tex \
auctex \
config-emacs-auctex \
emacs-auctex \
ge-auc"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs \
texlive-latex \
texlive-tools"

inherit rpm
