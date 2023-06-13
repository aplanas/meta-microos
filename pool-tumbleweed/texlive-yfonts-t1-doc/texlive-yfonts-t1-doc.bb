SUMMARY = "Documentation for texlive-yfonts-t1"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-t1"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-doc-2023.201.1.0svn36013-52.1.noarch.rpm"
RPM_HASH = "d6f3c22f4288db78a2f4994a16d38130827c0f84480c603a4c1a0cef5e9c3eabf2b00e92237ab0012e7d14c0c81611b979d4964774d8d492f4034360223053ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
