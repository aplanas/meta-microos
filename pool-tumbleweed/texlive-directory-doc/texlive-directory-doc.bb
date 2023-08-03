SUMMARY = "Documentation for texlive-directory"
DESCRIPTION = "This package includes the documentation for texlive-directory"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn15878"

RPM_NAME = "texlive-directory-doc-2023.209.1.20svn15878-53.1.noarch.rpm"
RPM_HASH = "48f39269bb899bb113448c1fd1138e0bf22b11c332089255dd436edfbf3274124ed0c59fb9aa5d25b4bb4dac9c6b166062af1e510cc3e3a814803dec08ce0c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-directory-doc"

RDEPENDS:${PN} += ""

inherit rpm
