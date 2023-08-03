SUMMARY = "Documentation for texlive-cjkpunct"
DESCRIPTION = "This package includes the documentation for texlive-cjkpunct"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.8.4svn41119"

RPM_NAME = "texlive-cjkpunct-doc-2023.209.4.8.4svn41119-54.1.noarch.rpm"
RPM_HASH = "73de62b44223bdcaaa76f73f871b6612a536debe9cdc7d44ac971f19fcd76e95e05ce96c1340d7d9b46d4860c15e4dcd91f5ec3d82f1d3c59bf9c6e330aea353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjkpunct-doc"

RDEPENDS:${PN} += ""

inherit rpm
