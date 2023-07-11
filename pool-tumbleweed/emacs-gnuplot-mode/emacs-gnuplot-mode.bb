SUMMARY = "Gnuplot mode for EMACS"
DESCRIPTION = "Gnuplot-mode is a major Emacs mode for editing Gnuplot source code. It \
provides syntax highlighting, automatic indentation and context sensitive \
command completion."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "emacs-gnuplot-mode-0.7.0-1.10.noarch.rpm"
RPM_HASH = "cf1e82824cf979f216a5e74e1f7b8241ef17bda88e073deca4145893df0fd352060179dc7938a06809efb8a57d17c46fa55dac99e3b05c0f7e7a4bde14febdd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-gnuplot-mode \
gnuplot-/usr/share/emacs/site-lisp/gnuplot.el"

RDEPENDS:${PN} += "emacs \
gnuplot"

inherit rpm
