SUMMARY = "A Portable Emacs Library"
DESCRIPTION = "A Portable Emacs Library"
LICENSE = "GPL-2.0-or-later"

PV = "10.8+80+g6947dc4"

RPM_NAME = "emacs-apel-10.8+80+g6947dc4-1.4.noarch.rpm"
RPM_HASH = "465abc8698feedddfe397931533dac3e79f0e3a574c2f74a3da3a90c7e70a790708f21221d4e0b1854a8986c2a212a09494eafefa549e82727d59d54831563f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apel emacs-apel"
RDEPENDS:${PN} += "emacs emacs_program"

inherit rpm
