SUMMARY = "Documentation for texlive-imfellenglish"
DESCRIPTION = "This package includes the documentation for texlive-imfellenglish"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64568"

RPM_NAME = "texlive-imfellenglish-doc-2023.201.svn64568-52.1.noarch.rpm"
RPM_HASH = "b06052180cda266ded2687289b9abf7aa23c82788c54db8350e4ad0dfa7828db05509ad61aa7ca2bf0cc01fa81b4761acab5c3efdf0cce0ee13d745a4d184c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imfellenglish-doc"
RDEPENDS:${PN} += ""

inherit rpm
