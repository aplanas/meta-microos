SUMMARY = "GNU Emacs-nox: An Emacs Binary without X Window System Support"
DESCRIPTION = "Eight Megabytes And Constantly Swapping. Call it \
 \
emacs-nox \
 \
Love it or leave it."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-nox-28.2-4.3.aarch64.rpm"
RPM_HASH = "87982cd503e95054811f07cef1d6ee23f65ce8a982ef9e9fe74150d19012acd7688229ea5ef781157af4a083b8eef60b3c43e22e3db257b47b0d98b9dbfacc1a"

RPROVIDES:${PN} += "emacs-nox \
emacs-program"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs \
emacs-eln \
fileutils \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgccjit.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgpm.so.2 \
libjansson.so.4 \
liblcms2.so.2 \
libm.so.6 \
libselinux.so.1 \
libsystemd.so.0 \
libtinfo.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
