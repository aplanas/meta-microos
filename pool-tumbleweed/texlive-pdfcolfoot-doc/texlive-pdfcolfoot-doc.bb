SUMMARY = "Documentation for texlive-pdfcolfoot"
DESCRIPTION = "This package includes the documentation for texlive-pdfcolfoot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65512"

RPM_NAME = "texlive-pdfcolfoot-doc-2023.209.1.4svn65512-52.1.noarch.rpm"
RPM_HASH = "771777dbbde77bcaaa1bced7989364422bb47c6e59f8b34dac4f7a828f07d33fdcee3ba27aef251b48c13753990856f497ac6d1ebf8fbad200c79f29383001bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcolfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
