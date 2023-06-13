SUMMARY = "Documentation for texlive-fetchcls"
DESCRIPTION = "This package includes the documentation for texlive-fetchcls"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45245"

RPM_NAME = "texlive-fetchcls-doc-2023.201.1.0svn45245-52.1.noarch.rpm"
RPM_HASH = "19728c3471da26e3897d06b9d8694cb3c0dd3f7969f0e277cb9bc3a95bb48c382761b4f83b4adf55286abcf252127cd78c79f4e8dfd1c5c80d6d5a2ef1b9008c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fetchcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
