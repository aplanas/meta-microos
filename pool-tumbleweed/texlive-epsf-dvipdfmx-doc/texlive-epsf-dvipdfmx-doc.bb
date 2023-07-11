SUMMARY = "Documentation for texlive-epsf-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-epsf-dvipdfmx"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-doc-2023.201.2014svn35575-53.2.noarch.rpm"
RPM_HASH = "97504184d4ab24c5ea5237f9f6933b9d7f029e410b6f95ee13f624eab53d3e163aaa85914d030dff2404e0b08af92fd77dd23baa46cb5b78011c5e2d9f18ca55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-dvipdfmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
