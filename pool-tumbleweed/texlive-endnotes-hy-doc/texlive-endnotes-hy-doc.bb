SUMMARY = "Documentation for texlive-endnotes-hy"
DESCRIPTION = "This package includes the documentation for texlive-endnotes-hy"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54758"

RPM_NAME = "texlive-endnotes-hy-doc-2023.209.svn54758-54.1.noarch.rpm"
RPM_HASH = "16e3316b01472e5bc88342a50850d878c2f2f511c3c7aff18ec18be0dadac5aa0ab032121be15c2683243f85df57803e0964d5e5d58b2e9a419f2808faf49ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-hy-doc"

RDEPENDS:${PN} += ""

inherit rpm
