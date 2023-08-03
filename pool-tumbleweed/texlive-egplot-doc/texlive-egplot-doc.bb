SUMMARY = "Documentation for texlive-egplot"
DESCRIPTION = "This package includes the documentation for texlive-egplot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02asvn20617"

RPM_NAME = "texlive-egplot-doc-2023.209.1.02asvn20617-54.1.noarch.rpm"
RPM_HASH = "6a7efa4a9052986532f5100f8357641cdf7e1ab972a961a7571c3421a0353cd31d3ff802bac12b8531e7f08202ecae7bc6004a7ea440efaf420771f3079ebf39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
