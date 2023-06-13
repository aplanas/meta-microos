SUMMARY = "Documentation for texlive-prelim2e"
DESCRIPTION = "This package includes the documentation for texlive-prelim2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn57000"

RPM_NAME = "texlive-prelim2e-doc-2023.201.2.00svn57000-52.1.noarch.rpm"
RPM_HASH = "dd52b5efb1f458e053f51fd0cbc81d5620d0414d54693859efa8856cd76ba433503aec6ba19c257937d82f45e643d1c61de231b65ef8bdc3c0b5dff0b97798e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prelim2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
