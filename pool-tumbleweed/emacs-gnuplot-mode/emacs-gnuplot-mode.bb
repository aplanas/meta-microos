SUMMARY = "Gnuplot mode for EMACS"
DESCRIPTION = "Gnuplot-mode is a major Emacs mode for editing Gnuplot source code. It \
provides syntax highlighting, automatic indentation and context sensitive \
command completion."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "emacs-gnuplot-mode-0.7.0-1.9.noarch.rpm"
RPM_HASH = "8946c087563e4e4da2755dbd267764fccee4766278305b6c7689d2f1a17a5b460c71fc54b9c30c5e6b6fae7abcf6d46addd95341b56052ab938e38599d52b597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-gnuplot-mode \
gnuplot:/usr/share/emacs/site-lisp/gnuplot.el"
RDEPENDS:${PN} += "emacs \
gnuplot"

inherit rpm
