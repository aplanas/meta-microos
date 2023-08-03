SUMMARY = "Documentation for texlive-psfragx"
DESCRIPTION = "This package includes the documentation for texlive-psfragx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn26243"

RPM_NAME = "texlive-psfragx-doc-2023.209.1.1svn26243-53.1.noarch.rpm"
RPM_HASH = "206a39ca4bae9ee2327347989037a2c274202a0b7bd0c2f45496f545917cbce656a60047a6de62876c5369f952b6ba2cf3407d5038dcb116ed111f9148714a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psfragx-doc"

RDEPENDS:${PN} += ""

inherit rpm
