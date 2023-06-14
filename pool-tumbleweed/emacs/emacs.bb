SUMMARY = "GNU Emacs Base Package"
DESCRIPTION = "Basic package for the GNU Emacs editor.  For a documentation see https://www.emacsdocs.org/. \
This package requires emacs-x11 and/or emacs-nox to have the GNU Emacs editor its self."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-28.2-4.2.aarch64.rpm"
RPM_HASH = "f0b35b2c4f2329caf106865303562cdb7ceed69abdc0b2091018dfcc17224530797cdabf92da71272ba1f4777aa5d0c2baacf97a06b47d94c4ccebff97538629"

RPROVIDES:${PN} += "config-emacs \
emacs \
epg \
nxml-mode"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
emacs-info \
emacs-program \
etags \
fileutils \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
mailutils \
user-games"

inherit rpm
