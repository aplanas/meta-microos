SUMMARY = "Documentation for texlive-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-pstricks"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.18svn65346"

RPM_NAME = "texlive-pstricks-doc-2023.209.3.18svn65346-54.1.noarch.rpm"
RPM_HASH = "317e4d846711cdfe18aa960dd5742a9d90b9df35ddc89f6d7d6652b26c0fee56f75ec12b65ba5071d4337df5b939e6e3e504567c6521c5acbf586772e96290ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
