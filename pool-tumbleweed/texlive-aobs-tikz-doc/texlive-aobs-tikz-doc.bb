SUMMARY = "Documentation for texlive-aobs-tikz"
DESCRIPTION = "This package includes the documentation for texlive-aobs-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn32662"

RPM_NAME = "texlive-aobs-tikz-doc-2023.209.1.0svn32662-55.1.noarch.rpm"
RPM_HASH = "d7f9bb24fcee31a8c8cc0bad2e5d162b54321ac606d06f1832043b7749a5b0b63548866b4a21291dbcdc9b6d43a40a930a12ae3055e86d17b7a037a1e046657e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aobs-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
