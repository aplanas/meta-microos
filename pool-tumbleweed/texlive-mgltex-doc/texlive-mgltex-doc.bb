SUMMARY = "Documentation for texlive-mgltex"
DESCRIPTION = "This package includes the documentation for texlive-mgltex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.2svn63255"

RPM_NAME = "texlive-mgltex-doc-2023.201.4.2svn63255-54.1.noarch.rpm"
RPM_HASH = "7a389b0a983d05c7b924fce6397f3e120dddd7140999baadb51c2f0b47ad87d2613f3ab8d3a912f81da865c99df2d41b7fac3542ab2502588ffc6e7ce668ed65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex-doc \
texlive-mgltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
