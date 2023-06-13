SUMMARY = "Color themes for emacs"
DESCRIPTION = "Emacs Color Themes is an add-on package for GNU Emacs. \
It provides several different color themes to skin your Emacs greatly \
improving the editing experience."
LICENSE = "GPL-2.0+"

PV = "6.6.0"

RPM_NAME = "emacs-color-theme-6.6.0-1.16.noarch.rpm"
RPM_HASH = "1abd2d348ea9e6377747fe2ebda662dba4b9f0ffb91ebf9a9108be00ebb508131e7941149650b1abf287d820df44121694dcac46ef5a7e1158977bdc40fc0a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-color-theme"

RDEPENDS:${PN} += "emacs"

inherit rpm
