SUMMARY = "Emacs lisp email client based on notmuch"
DESCRIPTION = "notmuch-based email client written in emacs lisp"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-emacs-0.37-3.1.aarch64.rpm"
RPM_HASH = "4b8a4de1e21412d163efe7836ffeacc344d0e60f514965509142ee00502377fb1132fc707f22d7be1c93946da692dfcc9163562dcbcc2640b1cdc4848a0788c5"

RPROVIDES:${PN} += "notmuch-emacs"

RDEPENDS:${PN} += "emacs \
emacs-el \
notmuch"

inherit rpm
