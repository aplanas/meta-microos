SUMMARY = "Documentation for texlive-inline-images"
DESCRIPTION = "This package includes the documentation for texlive-inline-images"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-inline-images-doc-2023.201.1.0svn61719-52.1.noarch.rpm"
RPM_HASH = "9aacde11024668cde004bfc2a76353a75a6f89c6d3bc519544b8a41ec7dc79ec9c2dd52233d3d9bf41fefb0353e59a803c1eae586e3f48d1c1594a98baff8d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inline-images-doc"

RDEPENDS:${PN} += ""

inherit rpm
