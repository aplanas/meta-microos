SUMMARY = "Documentation for texlive-ed"
DESCRIPTION = "This package includes the documentation for texlive-ed"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn25231"

RPM_NAME = "texlive-ed-doc-2023.209.1.8svn25231-54.1.noarch.rpm"
RPM_HASH = "f2c437472780e3bb2627314b0d2274b55de4456ec87f5a33d3bc32aa85461fb899c3d87d66bcd29e50b8c0eb707544acd8426054d7c5151478766c247fa4a7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ed-doc"

RDEPENDS:${PN} += ""

inherit rpm
