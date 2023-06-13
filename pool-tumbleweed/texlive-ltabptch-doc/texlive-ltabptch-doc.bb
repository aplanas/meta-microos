SUMMARY = "Documentation for texlive-ltabptch"
DESCRIPTION = "This package includes the documentation for texlive-ltabptch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.74dsvn17533"

RPM_NAME = "texlive-ltabptch-doc-2023.201.1.74dsvn17533-52.1.noarch.rpm"
RPM_HASH = "fce74dc8deff6a08860824ffa3cdec4c1cd5702a5396ab75b2fb7abd3dddc2951e857566c74ec08b7f949a341d89eab8ce3799fa4cc7887814468644c212d303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltabptch-doc"

RDEPENDS:${PN} += ""

inherit rpm
