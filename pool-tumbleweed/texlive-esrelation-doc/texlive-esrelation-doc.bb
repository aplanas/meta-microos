SUMMARY = "Documentation for texlive-esrelation"
DESCRIPTION = "This package includes the documentation for texlive-esrelation"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn37236"

RPM_NAME = "texlive-esrelation-doc-2023.209.svn37236-53.1.noarch.rpm"
RPM_HASH = "450e3c619c662db025b124331dd3cf047f88f5a5851498b85e715b51d57cd22cdf28ebc1fbee3207496ad4c0f3b21abe6abba994f12ea6f6a7a97aaccca150d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esrelation-doc"

RDEPENDS:${PN} += ""

inherit rpm
