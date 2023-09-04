SUMMARY = "Documentation for texlive-hitreport"
DESCRIPTION = "This package includes the documentation for texlive-hitreport"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn58357"

RPM_NAME = "texlive-hitreport-doc-2023.209.1.0.0svn58357-54.2.noarch.rpm"
RPM_HASH = "7127fda15144861613d6c2139069eac5d1fa36342881450612ae7b10febb68c518ce99d649003c734a51e391e2919ec2a48785a8d7084fccdcb21f1b7a431c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitreport-doc-zh \
texlive-hitreport-doc"

RDEPENDS:${PN} += ""

inherit rpm
