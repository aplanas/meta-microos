SUMMARY = "Documentation for texlive-eltex"
DESCRIPTION = "This package includes the documentation for texlive-eltex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-eltex-doc-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "0ba47fd6f87e78b613f10b6a34e1a66f4511dfa0f71df2355f492f10e2869e723205a29b297c5beb4159ece1f0857c98b745568dec2a31cdaf7d7f2b626dcdde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eltex-doc-en;cs \
texlive-eltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
