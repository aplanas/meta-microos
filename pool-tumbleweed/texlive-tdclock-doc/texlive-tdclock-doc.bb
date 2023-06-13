SUMMARY = "Documentation for texlive-tdclock"
DESCRIPTION = "This package includes the documentation for texlive-tdclock"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.5svn33043"

RPM_NAME = "texlive-tdclock-doc-2023.201.2.5svn33043-54.1.noarch.rpm"
RPM_HASH = "c91e0845f3bbc725b2c5bc984c78882482fb6d996f516222aa4a0f021a637ec0488e215a47c525319b2f87fcf763a0f8a25d3ab4e8244585987b369224e87f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tdclock-doc"

RDEPENDS:${PN} += ""

inherit rpm
