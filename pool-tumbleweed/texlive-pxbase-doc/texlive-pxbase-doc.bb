SUMMARY = "Documentation for texlive-pxbase"
DESCRIPTION = "This package includes the documentation for texlive-pxbase"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn66187"

RPM_NAME = "texlive-pxbase-doc-2023.209.1.4svn66187-54.1.noarch.rpm"
RPM_HASH = "b19e6fbeafc493b8041ba69a746e28477ed4c2512132ede4787022669b20a6427914f934a2f6c6b0c46f1747707be05779e7a25aac656edecd65d1971589c342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxbase-doc-ja \
texlive-pxbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
