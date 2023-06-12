SUMMARY = "Documentation for texlive-wnri-latex"
DESCRIPTION = "This package includes the documentation for texlive-wnri-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0bsvn22338"

RPM_NAME = "texlive-wnri-latex-doc-2023.201.1.0bsvn22338-53.1.noarch.rpm"
RPM_HASH = "850e94904b01c62f746fdf737de7026ee6a8315bcd44e46d343834737988e668b40e3571fbe748bd199c5a975938c340422bed7c302b96d36828151158b20d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wnri-latex-doc"
RDEPENDS:${PN} += ""

inherit rpm
