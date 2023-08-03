SUMMARY = "Documentation for texlive-thesis-titlepage-fhac"
DESCRIPTION = "This package includes the documentation for texlive-thesis-titlepage-fhac"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-thesis-titlepage-fhac-doc-2023.209.0.0.1svn15878-55.1.noarch.rpm"
RPM_HASH = "cf4da4f8eaaa6bb43ccd3054fb9cd6b652c0e6dd40251e1f149ffe4e5d2b074ac9e583fdc291c8982e33b76731a1a0029847456cc547813f7e7d653ca445ec48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thesis-titlepage-fhac-doc"

RDEPENDS:${PN} += ""

inherit rpm
