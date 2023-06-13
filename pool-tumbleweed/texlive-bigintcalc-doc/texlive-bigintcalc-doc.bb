SUMMARY = "Documentation for texlive-bigintcalc"
DESCRIPTION = "This package includes the documentation for texlive-bigintcalc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn53172"

RPM_NAME = "texlive-bigintcalc-doc-2023.201.1.5svn53172-53.1.noarch.rpm"
RPM_HASH = "4491ffe62efe24efc6a5ca9aa1cd35b04952ad50ce9d04d2da82c8241c7522e51492a00e49363a9e860d2ec6e614786dc87a5db997677632555c7cee6255d604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigintcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
