SUMMARY = "Documentation for texlive-pst-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pst-soroban"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "bb38319af80e8355c1273a516c0d4ec19d6018ab39d797309b649616873d8e999a961884c3efdcae2e545cae7d0f80fb4a0b4e7472ce1f2ee68c8bbcd525d218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-soroban-doc"

RDEPENDS:${PN} += ""

inherit rpm
