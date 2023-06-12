SUMMARY = "Documentation for texlive-marcellus"
DESCRIPTION = "This package includes the documentation for texlive-marcellus"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64451"

RPM_NAME = "texlive-marcellus-doc-2023.201.svn64451-52.1.noarch.rpm"
RPM_HASH = "17f2f6a563318048bfd277475c05c374fd6d8c2a3a725c024ffebe7d11a78735d2a80230998bf323a04e53592d021647f3a1c8bc5704b7ba0641904b60389e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marcellus-doc"
RDEPENDS:${PN} += ""

inherit rpm
