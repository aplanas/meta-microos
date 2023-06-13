SUMMARY = "Documentation for texlive-lua-check-hyphen"
DESCRIPTION = "This package includes the documentation for texlive-lua-check-hyphen"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7asvn47527"

RPM_NAME = "texlive-lua-check-hyphen-doc-2023.201.0.0.7asvn47527-52.1.noarch.rpm"
RPM_HASH = "6771407ea530fdf95417d369546ef26fc6631bec6685236f7c0116d8162acf78c67a21f59d0ca74161b8987912edd79fac0b5b40c2e72700d5e42b467373cafb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-check-hyphen-doc"

RDEPENDS:${PN} += ""

inherit rpm
