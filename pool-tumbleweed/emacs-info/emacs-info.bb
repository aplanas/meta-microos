SUMMARY = "Info files for GNU Emacs"
DESCRIPTION = "This package contains all the Info files for GNU Emacs. These files can \
be read online with GNU Emacs. They describe Emacs and some of its \
modes."
LICENSE = "GPL-3.0-or-later"

PV = "29.1"

RPM_NAME = "emacs-info-29.1-3.1.noarch.rpm"
RPM_HASH = "9f5eca9b606269da353096a235a0ef6edfd905a77eda704e92f5e74767a80854bcace651816539fceabd01adcf7831152add1b7a51701c92471cf5d64f31f7ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-info"

RDEPENDS:${PN} += ""

inherit rpm
