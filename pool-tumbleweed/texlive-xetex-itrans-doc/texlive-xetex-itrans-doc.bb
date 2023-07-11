SUMMARY = "Documentation for texlive-xetex-itrans"
DESCRIPTION = "This package includes the documentation for texlive-xetex-itrans"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-doc-2023.201.4.2svn55475-52.2.noarch.rpm"
RPM_HASH = "fd7cc715615c55dcc5d678aec4631890b607fdf9316f2b80144eb7d0189ef26a08087373f2602ed5cf0a484231f4e9a718691df718a517697cc74ffdb88e3219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-itrans-doc"

RDEPENDS:${PN} += ""

inherit rpm
