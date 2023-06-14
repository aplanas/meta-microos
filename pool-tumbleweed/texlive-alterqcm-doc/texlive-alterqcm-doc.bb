SUMMARY = "Documentation for texlive-alterqcm"
DESCRIPTION = "This package includes the documentation for texlive-alterqcm"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.42csvn59265"

RPM_NAME = "texlive-alterqcm-doc-2023.201.4.42csvn59265-54.1.noarch.rpm"
RPM_HASH = "074ce594061b1eed378f4a666fd7ffd69bd09dd226924b02907a39a4f48ad775db8bc5bc594c2af225637f51eed157325ca61ff650b9dd9c95050d4c92662755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-alterqcm-doc-en \
texlive-alterqcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
