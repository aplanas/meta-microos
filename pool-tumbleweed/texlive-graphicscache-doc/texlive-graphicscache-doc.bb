SUMMARY = "Documentation for texlive-graphicscache"
DESCRIPTION = "This package includes the documentation for texlive-graphicscache"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.4svn65318"

RPM_NAME = "texlive-graphicscache-doc-2023.209.0.0.4svn65318-54.2.noarch.rpm"
RPM_HASH = "df53a9ffec046fdfed5fbbf68bbeded8fd0d2610f18fb3ba249a9d713167ef510086f21d44d9c7528370567798a3d9b953de3bfc06b82d92671bfc4036fa7e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicscache-doc"

RDEPENDS:${PN} += ""

inherit rpm
