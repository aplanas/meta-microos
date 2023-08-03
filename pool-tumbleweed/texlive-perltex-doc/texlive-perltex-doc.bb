SUMMARY = "Documentation for texlive-perltex"
DESCRIPTION = "This package includes the documentation for texlive-perltex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn52162"

RPM_NAME = "texlive-perltex-doc-2023.209.2.2svn52162-52.1.noarch.rpm"
RPM_HASH = "427c42fbde7855b852675ca9c6c6d80151d130da223b474a59d940ce9801b0b85b8d21a517fb179fd9a189dc461f145cbad04f1cf475e9195a2e6ade09492bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-perltex.1 \
texlive-perltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
