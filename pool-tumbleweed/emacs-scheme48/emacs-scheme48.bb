SUMMARY = "CMUScheme48 emacs mode"
DESCRIPTION = "Scheme process in a buffer.  Adapted from cmuscheme.el"
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "emacs-scheme48-1.9.2-2.18.aarch64.rpm"
RPM_HASH = "b14325d5492caa37b5e7c0d5c69812da96056ccba1229f7490b026f98209c7b03e69b6bc548848d16af1054a3d6992d4e0e6dcbd68a51ad4ead44529dee40b08"

RPROVIDES:${PN} += "emacs-scheme48 \
emacs-scheme48(aarch-64)"

RDEPENDS:${PN} += "scheme48"

inherit rpm
