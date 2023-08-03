SUMMARY = "Documentation for texlive-etsvthor"
DESCRIPTION = "This package includes the documentation for texlive-etsvthor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48186"

RPM_NAME = "texlive-etsvthor-doc-2023.209.1.0svn48186-53.1.noarch.rpm"
RPM_HASH = "34bc27954fa1e589fb9f9183d986821d7d9a52598cf312f92a97ff7af2c3f6bc1c5bfd941e64320d7df2c0fb95a4b95e948e5788e23026dc9c173db7d3ebb2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etsvthor-doc"

RDEPENDS:${PN} += ""

inherit rpm
