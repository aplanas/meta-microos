SUMMARY = "Documentation for texlive-chickenize"
DESCRIPTION = "This package includes the documentation for texlive-chickenize"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn57325"

RPM_NAME = "texlive-chickenize-doc-2023.209.0.0.3svn57325-54.1.noarch.rpm"
RPM_HASH = "4c65fba3a6a05ffad31478976f9a119adb766f1aa4ab66be3ba61e84cbe02a3fcdbbaca7f601d9f61bfd86c8afe9e0b7147820070a7c0e741dfb2ae60056a126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chickenize-doc"

RDEPENDS:${PN} += ""

inherit rpm
