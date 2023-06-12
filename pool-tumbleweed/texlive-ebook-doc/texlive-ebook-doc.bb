SUMMARY = "Documentation for texlive-ebook"
DESCRIPTION = "This package includes the documentation for texlive-ebook"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn29466"

RPM_NAME = "texlive-ebook-doc-2023.201.svn29466-53.1.noarch.rpm"
RPM_HASH = "8bc853f1f2df3b830892835a1b70b71833bde248953e885fc0457b6e7ab97afd9ce53f35e281aaa344961f66f4ea448084d3402c0991e69afdbca235cbf8c3b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebook-doc"
RDEPENDS:${PN} += ""

inherit rpm
