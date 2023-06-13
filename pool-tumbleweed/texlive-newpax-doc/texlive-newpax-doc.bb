SUMMARY = "Documentation for texlive-newpax"
DESCRIPTION = "This package includes the documentation for texlive-newpax"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.53svn64415"

RPM_NAME = "texlive-newpax-doc-2023.201.0.0.53svn64415-54.1.noarch.rpm"
RPM_HASH = "77c220c5cc8aa751e5f5beb0abdf4326cb435e373cdeebbed406237f2c17cf249154cd819c6516df2de43fcc54685e38dcbe3c877f91e7c01eb5c1c5ab847729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newpax-doc"

RDEPENDS:${PN} += ""

inherit rpm
