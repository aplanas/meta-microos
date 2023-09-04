SUMMARY = "Documentation for texlive-envbig"
DESCRIPTION = "This package includes the documentation for texlive-envbig"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-envbig-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "666f24642ec32932603e16d30a6d4d5a41e9042e55a2426a57e9e23c4572461171ee9745bd763bff9c4e489212a3c0efa046f5e56a3f5a2261b99a96d242d1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envbig-doc"

RDEPENDS:${PN} += ""

inherit rpm
