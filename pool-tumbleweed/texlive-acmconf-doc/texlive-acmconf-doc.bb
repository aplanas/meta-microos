SUMMARY = "Documentation for texlive-acmconf"
DESCRIPTION = "This package includes the documentation for texlive-acmconf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-acmconf-doc-2023.209.1.3svn15878-55.1.noarch.rpm"
RPM_HASH = "ea2d6678890e75255d69684392fae8faad5c03de95c0c065b6a94c44a1cf58c259fb8d515145a5a8d96fa34f0a4c6f1774e0bb6f11699c225a651e29589ea508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acmconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
