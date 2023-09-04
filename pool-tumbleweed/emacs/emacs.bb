SUMMARY = "GNU Emacs Base Package"
DESCRIPTION = "Basic package for the GNU Emacs editor.  For a documentation see https://www.emacsdocs.org/. \
This package requires emacs-x11 and/or emacs-nox to have the GNU Emacs editor its self."
LICENSE = "GPL-3.0-or-later"

PV = "29.1"

RPM_NAME = "emacs-29.1-3.1.aarch64.rpm"
RPM_HASH = "48d7e4a0e8ff6b27f183377fd64ff7633dd672072d42616dbab5881606424e5d3cfdcd9552b30fa9a37b9da9486b73f3449f9201f450885fc6629d93bb5b51df"

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
