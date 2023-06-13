SUMMARY = "Documentation for texlive-fistrum"
DESCRIPTION = "This package includes the documentation for texlive-fistrum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn66461"

RPM_NAME = "texlive-fistrum-doc-2023.201.0.0.1svn66461-52.1.noarch.rpm"
RPM_HASH = "1e5fb6816c257b66e8c7dd1148b6a5e0d3ead02da214c06061f4bf09f9c8192948d662bf2a3e9b9cea290cd4aacb19f3e0df2940c1de8778633e65329d58ff13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fistrum-doc"

RDEPENDS:${PN} += ""

inherit rpm
