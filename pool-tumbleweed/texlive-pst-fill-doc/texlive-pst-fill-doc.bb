SUMMARY = "Documentation for texlive-pst-fill"
DESCRIPTION = "This package includes the documentation for texlive-pst-fill"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn60671"

RPM_NAME = "texlive-pst-fill-doc-2023.201.1.02svn60671-52.1.noarch.rpm"
RPM_HASH = "64890c98af309de025c7a95bd8d240e815035982d51d3342cb84e0ffda42572880ff9d76378e69376ccc2e4c8a714ad98bb2379354199f17b868411acdc5bad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fill-doc"

RDEPENDS:${PN} += ""

inherit rpm
