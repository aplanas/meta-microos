SUMMARY = "Documentation for texlive-newpx"
DESCRIPTION = "This package includes the documentation for texlive-newpx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.505svn61806"

RPM_NAME = "texlive-newpx-doc-2023.201.1.505svn61806-54.1.noarch.rpm"
RPM_HASH = "63f208e93343584d57482cbe80d70e8fe43cd31a9969b458c1e543979c9973ffc5815f3e37302540baa06569fedb056e524cfb65456c12a51306dad6a8add629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newpx-doc"

RDEPENDS:${PN} += ""

inherit rpm
