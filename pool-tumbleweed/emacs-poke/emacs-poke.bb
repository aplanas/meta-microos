SUMMARY = "Emacs support for poke"
DESCRIPTION = "Provides Emacs support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "emacs-poke-3.3-1.1.noarch.rpm"
RPM_HASH = "d61c2639d2fc0894c55cc170acd34eca18ef23e3a2f4eb5d983bb4e83ec12e32622307988797e63ad696fddc0667baa7139362c7fecd8f54aaf97bd6202e36cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-poke"

RDEPENDS:${PN} += "emacs \
poke"

inherit rpm
