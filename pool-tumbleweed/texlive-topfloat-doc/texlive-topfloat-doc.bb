SUMMARY = "Documentation for texlive-topfloat"
DESCRIPTION = "This package includes the documentation for texlive-topfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn19084"

RPM_NAME = "texlive-topfloat-doc-2023.209.svn19084-53.1.noarch.rpm"
RPM_HASH = "6ec457259501fb7b297eaf6e1b7ee2fe7a52a0a7b0497c1248737d9ed3383d1619730d617c460c2f2c737b1e3ca7fd42c3faa31af004818eb94b52ee1c1543d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-topfloat-doc-it \
texlive-topfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
