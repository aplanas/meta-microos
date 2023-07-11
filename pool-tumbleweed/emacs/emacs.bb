SUMMARY = "GNU Emacs Base Package"
DESCRIPTION = "Basic package for the GNU Emacs editor.  For a documentation see https://www.emacsdocs.org/. \
This package requires emacs-x11 and/or emacs-nox to have the GNU Emacs editor its self."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-28.2-4.3.aarch64.rpm"
RPM_HASH = "dd6c09a29932446395331b86abf8d3fe142ef96458fc701ca15fedf4b20eae8e4258b936d541858426d0ecd85982e1d87735b1f28284844cc0aa3d4ffabab5ac"

RPROVIDES:${PN} += "config-emacs \
emacs \
epg \
nxml-mode"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
