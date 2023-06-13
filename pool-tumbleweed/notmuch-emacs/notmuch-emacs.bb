SUMMARY = "Emacs lisp email client based on notmuch"
DESCRIPTION = "notmuch-based email client written in emacs lisp"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-emacs-0.37-2.4.aarch64.rpm"
RPM_HASH = "b5ee510ebf630311ec33aea793faf60aaf3cd58ca7fddf73c47d4582cc2152b2b199badef4318d9728674198c35bc3138c0eacf281815f597870911fe55827b0"

RPROVIDES:${PN} += "notmuch-emacs \
notmuch-emacs(aarch-64)"

RDEPENDS:${PN} += "emacs \
emacs-el \
notmuch"

inherit rpm
