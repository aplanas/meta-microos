SUMMARY = "Documentation for texlive-refcheck"
DESCRIPTION = "This package includes the documentation for texlive-refcheck"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-doc-2023.209.1.9.1svn29128-54.1.noarch.rpm"
RPM_HASH = "67272d98d4193264468bcab9a6927e29cf1be5994d5b5761d61dd37717341a95ac3c58159a08a8697a5a35a1af11ae76e5c183a724ef115e63a17c0ed09dcf34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
