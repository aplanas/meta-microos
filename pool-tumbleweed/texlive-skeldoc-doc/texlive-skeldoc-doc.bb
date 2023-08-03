SUMMARY = "Documentation for texlive-skeldoc"
DESCRIPTION = "This package includes the documentation for texlive-skeldoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn57922"

RPM_NAME = "texlive-skeldoc-doc-2023.209.0.0.1.2svn57922-58.1.noarch.rpm"
RPM_HASH = "3229068c0e5e7fc3bd396ac6e233a73e0d260171541aff8574f67b3390c694dfb15845433c55b71ccf4fe9164597f753c231a9cd0c02c303b150f7b859070883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
