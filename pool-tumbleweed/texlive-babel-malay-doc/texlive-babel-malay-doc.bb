SUMMARY = "Documentation for texlive-babel-malay"
DESCRIPTION = "This package includes the documentation for texlive-babel-malay"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0msvn43234"

RPM_NAME = "texlive-babel-malay-doc-2023.209.1.0msvn43234-54.1.noarch.rpm"
RPM_HASH = "16406e8783e39ba96f7f726f13772d39852b12eadd653f63ed6b6e6e9d495805b82e4bad18e16b39645cfe8e154f401a3a6096ed0fa1b07595cdd46c4dd1cee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-malay-doc"

RDEPENDS:${PN} += ""

inherit rpm
