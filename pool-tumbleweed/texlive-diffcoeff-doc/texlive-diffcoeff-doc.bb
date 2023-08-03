SUMMARY = "Documentation for texlive-diffcoeff"
DESCRIPTION = "This package includes the documentation for texlive-diffcoeff"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.2svn65676"

RPM_NAME = "texlive-diffcoeff-doc-2023.209.5.2svn65676-53.1.noarch.rpm"
RPM_HASH = "02cfab47e1cc2a95777332a9c920c44a259bf7285a92cc63b0f1f57fa442b6a1ebf433c8f561822ba8c934e6ee4ec970745c130a7be6dc96b6d010d74e8b3be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diffcoeff-doc"

RDEPENDS:${PN} += ""

inherit rpm
