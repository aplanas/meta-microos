SUMMARY = "Documentation for texlive-refman"
DESCRIPTION = "This package includes the documentation for texlive-refman"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0esvn15878"

RPM_NAME = "texlive-refman-doc-2023.209.2.0esvn15878-54.2.noarch.rpm"
RPM_HASH = "38e1e1643ab2da13c8f7cfd2b1043ee2026b17076bbbfcb9bf59c525dfc2545c0b4f9109197309773c3163713190b35a2570c293029e912acf1d409028b74219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-refman-doc-de;en \
texlive-refman-doc"

RDEPENDS:${PN} += ""

inherit rpm
