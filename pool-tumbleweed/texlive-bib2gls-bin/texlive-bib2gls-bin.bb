SUMMARY = "Binary files of bib2gls"
DESCRIPTION = "Binary files of bib2gls"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45266"

RPM_NAME = "texlive-bib2gls-bin-2023.20230311.svn45266-93.1.aarch64.rpm"
RPM_HASH = "8eae19b2f4f3c0098f1fcb3999107f3b9041a4b9de16edaa9957e19cddbb9d2dd18349b43d00c46749596e74474e7e8f73a207a4408f19c01545b2933ab26172"

RPROVIDES:${PN} += "texlive-bib2gls-bin"

RDEPENDS:${PN} += "texlive-bib2gls"

inherit rpm
