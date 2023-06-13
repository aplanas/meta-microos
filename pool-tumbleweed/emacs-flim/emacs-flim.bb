SUMMARY = "An Emacs Library for MIME"
DESCRIPTION = "For coding and decoding MIME messages."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.9+136+g2cf5a78"

RPM_NAME = "emacs-flim-1.14.9+136+g2cf5a78-1.1.noarch.rpm"
RPM_HASH = "5aee53c0ad740ec17b560aa6cab1d6c00a9d84da5a9b86bcd5f18dd7fa75cba00ee2fe65f75b135e091c081920d5cdb37e3304257a68b100f6c2182533cde8b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-flim \
flim"

RDEPENDS:${PN} += "emacs \
emacs-apel \
emacs_program"

inherit rpm
