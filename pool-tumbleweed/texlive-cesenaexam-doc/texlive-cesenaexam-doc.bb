SUMMARY = "Documentation for texlive-cesenaexam"
DESCRIPTION = "This package includes the documentation for texlive-cesenaexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn44960"

RPM_NAME = "texlive-cesenaexam-doc-2023.201.0.0.2svn44960-52.1.noarch.rpm"
RPM_HASH = "81e2b2558835414e4a0d6569d79debd2fa50e4ba609a936bcd39dd17cdcd6c1b887f62db6821b6d700546671933e0db730a52a50a15c30ad13cf64af14707861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cesenaexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
