SUMMARY = "Documentation for texlive-epsf-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-epsf-dvipdfmx"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-doc-2023.201.2014svn35575-53.1.noarch.rpm"
RPM_HASH = "573a78dda5e6257f405838d91e5bfaf1ce8b0f70b17e3091e82ffb4f0821c2dfe77932bd7883856e778cbce736a587efe0ff5879334b736c4292d00822ba3ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-dvipdfmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
