SUMMARY = "Documentation for texlive-achemso"
DESCRIPTION = "This package includes the documentation for texlive-achemso"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13fsvn65103"

RPM_NAME = "texlive-achemso-doc-2023.201.3.13fsvn65103-54.1.noarch.rpm"
RPM_HASH = "4ca4e5d2287ffc0d2537fb31deb09e09d7f1e86942aee1ee9db77914b05be20f5be730b1e15529b90b2129ad6b969cf1d4739ee0b2db4f2ab1d3356cbd0219fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-achemso-doc"

RDEPENDS:${PN} += ""

inherit rpm
