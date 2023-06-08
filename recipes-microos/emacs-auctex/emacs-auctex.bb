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

PV = "13.1"

RPM_NAME = "emacs-auctex-13.1-2.1.noarch.rpm"
RPM_HASH = "0e05eaf54f315fb74ead8779d03f43f77544a22e65191e458c4863cb4a1f3a56ec753ec11697bc9b074e15e9249b930d8e80dec2837201f4457efdf78021d3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auc-tex auctex config(emacs-auctex) emacs-auctex ge_auc"
RDEPENDS:${PN} += "/bin/sh emacs texlive-latex texlive-tools"

inherit rpm
