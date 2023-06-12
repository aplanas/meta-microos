SUMMARY = "Documentation for texlive-permute"
DESCRIPTION = "This package includes the documentation for texlive-permute"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-permute-doc-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "21b70789b21942bb603fb603578f6599bd44a4eef445d046a48d63c2c689e6a91598cbd9fa2b4d2f176da13c6fdb5ab18abfaa84d66476dd095666222b84dce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-permute-doc"
RDEPENDS:${PN} += ""

inherit rpm
