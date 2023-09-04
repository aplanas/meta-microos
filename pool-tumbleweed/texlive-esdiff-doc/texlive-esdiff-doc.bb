SUMMARY = "Documentation for texlive-esdiff"
DESCRIPTION = "This package includes the documentation for texlive-esdiff"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21385"

RPM_NAME = "texlive-esdiff-doc-2023.209.1.2svn21385-54.2.noarch.rpm"
RPM_HASH = "c2da54608d1af3a871b253f4f9874142cdf2cfb5c2413b5659556ea1f243391cefa6b5826d1ade0ab8730103179705e84d4ce1b6cfa7be0dc1b091301e3cb353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
