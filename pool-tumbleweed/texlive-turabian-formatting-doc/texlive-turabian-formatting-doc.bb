SUMMARY = "Documentation for texlive-turabian-formatting"
DESCRIPTION = "This package includes the documentation for texlive-turabian-formatting"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58561"

RPM_NAME = "texlive-turabian-formatting-doc-2023.209.svn58561-53.1.noarch.rpm"
RPM_HASH = "c80ae49a7748af3127f7f1bffa6ccc9e90d4129ae6d2f10e2ec3e3b7d0cb743f71703bad08fb81cad98330dd7af53856082a75058a6d57c2fc49b0d158f5ead7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turabian-formatting-doc"

RDEPENDS:${PN} += ""

inherit rpm
