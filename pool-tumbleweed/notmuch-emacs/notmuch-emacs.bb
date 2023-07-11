SUMMARY = "Emacs lisp email client based on notmuch"
DESCRIPTION = "notmuch-based email client written in emacs lisp"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-emacs-0.37-2.6.aarch64.rpm"
RPM_HASH = "e7d33037b91fe0511b174adc611715a55aba8add97a5e88763256b1238f732a27175f7f8ead5b6387f7954c6db76ba994d2e2cd5eb16d45a3aea109f868a4322"

RPROVIDES:${PN} += "notmuch-emacs"

RDEPENDS:${PN} += "emacs \
emacs-el \
notmuch"

inherit rpm
