SUMMARY = "Documentation for texlive-stellenbosch"
DESCRIPTION = "This package includes the documentation for texlive-stellenbosch"
LICENSE = "LPPL-1.0"

PV = "2023.209.11asvn66379"

RPM_NAME = "texlive-stellenbosch-doc-2023.209.11asvn66379-58.1.noarch.rpm"
RPM_HASH = "a578c8085221aa4c35da00d5d7bb9ea66024094a242d8bb727f71d3025f098e7265c4b7f5e72046b794348fb3241c20382b0dc7b5452e387c910a39b35985e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-stellenbosch-doc-en \
texlive-stellenbosch-doc"

RDEPENDS:${PN} += ""

inherit rpm
