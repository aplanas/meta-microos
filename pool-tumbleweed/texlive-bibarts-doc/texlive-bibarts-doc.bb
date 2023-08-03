SUMMARY = "Documentation for texlive-bibarts"
DESCRIPTION = "This package includes the documentation for texlive-bibarts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.5svn64579"

RPM_NAME = "texlive-bibarts-doc-2023.209.2.5svn64579-54.1.noarch.rpm"
RPM_HASH = "3a40214342e45291fe0f8ee6c753d8406e51c4445d8bc38653a0df6c8c8c18ba486622c7e4323b9f8a5504310f07d8e20bfc77a7227d4448465925318bd1a13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bibarts-doc-de \
texlive-bibarts-doc"

RDEPENDS:${PN} += ""

inherit rpm
