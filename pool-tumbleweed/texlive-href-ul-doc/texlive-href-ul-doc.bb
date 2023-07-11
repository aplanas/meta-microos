SUMMARY = "Documentation for texlive-href-ul"
DESCRIPTION = "This package includes the documentation for texlive-href-ul"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-doc-2023.201.0.0.3.0svn64880-53.2.noarch.rpm"
RPM_HASH = "7575c54b65bc5b614db24b90b771e2dd18ba636e5803d79faacb5a9a0584124fc9d616936fae08318cd762923ab1c3f60ac17b12a18033bf2330366948c2b4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-href-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
