SUMMARY = "Documentation for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains documentation for Octave."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.0"

RPM_NAME = "octave-doc-8.3.0-1.1.noarch.rpm"
RPM_HASH = "dd95ef2499a65e019487b44b19f619735bc6665496f31f4a0ee5d66383d6ada2c741d9b9ec99034fb9a2a402aba511ddfa6ac74b72c6b81221d4b93a3acd40fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-doc"

RDEPENDS:${PN} += ""

inherit rpm
