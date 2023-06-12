SUMMARY = "Documentation for texlive-totalcount"
DESCRIPTION = "This package includes the documentation for texlive-totalcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn56214"

RPM_NAME = "texlive-totalcount-doc-2023.201.1.0asvn56214-52.1.noarch.rpm"
RPM_HASH = "49add88ab095bcf22f422f76694a195e75900a03b0ea29c17558dcac9b147f6c15350e2279c3e6277ec64118e13acd2161a5cc7af1ebb5700833b3bcb49009ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totalcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
