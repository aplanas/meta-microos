SUMMARY = "Documentation for texlive-halloweenmath"
DESCRIPTION = "This package includes the documentation for texlive-halloweenmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn52602"

RPM_NAME = "texlive-halloweenmath-doc-2023.201.0.0.11svn52602-53.1.noarch.rpm"
RPM_HASH = "99115819651511760f4932bc3ac292ac8e12c71574f8306e21a195f1a6689d96a958027798ecc3528072fb6705493c9da432007e416f1c24bb87d36c54afc93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-halloweenmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
