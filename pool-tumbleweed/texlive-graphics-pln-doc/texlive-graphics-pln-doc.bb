SUMMARY = "Documentation for texlive-graphics-pln"
DESCRIPTION = "This package includes the documentation for texlive-graphics-pln"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65187"

RPM_NAME = "texlive-graphics-pln-doc-2023.209.svn65187-54.1.noarch.rpm"
RPM_HASH = "d7b4f8262760a312f556c328932dd182bcdf5deac47e9275272bba230e86a777c4d10ac1f192dde6ae57f8933c315daea8acb4afc2a41041005de8a2c90b1d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-pln-doc"

RDEPENDS:${PN} += ""

inherit rpm
