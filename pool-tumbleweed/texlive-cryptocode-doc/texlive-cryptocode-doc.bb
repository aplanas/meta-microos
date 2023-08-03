SUMMARY = "Documentation for texlive-cryptocode"
DESCRIPTION = "This package includes the documentation for texlive-cryptocode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.44svn60249"

RPM_NAME = "texlive-cryptocode-doc-2023.209.0.0.44svn60249-55.1.noarch.rpm"
RPM_HASH = "f49e9a5b1c1148b340c750ae7fa0bce31f861dbf55087a4a75f30d067c38ea1c1fd74e968ac9e8c0597700b30f2af57b33e16c2d71be55e11200df2485f24c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cryptocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
