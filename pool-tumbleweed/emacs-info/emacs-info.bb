SUMMARY = "Info files for GNU Emacs"
DESCRIPTION = "This package contains all the Info files for GNU Emacs. These files can \
be read online with GNU Emacs. They describe Emacs and some of its \
modes."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-info-28.2-4.3.noarch.rpm"
RPM_HASH = "63687e5a923304d595686faa3246259c5ee5d3feb467c294af86b8dcab02150235c502f7c578092a79e6efbae0d317cc02f6c8d2facfb4a32571c62bd0b348a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-info"

RDEPENDS:${PN} += ""

inherit rpm
