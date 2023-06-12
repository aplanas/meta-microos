SUMMARY = "Beamer themes for Boston College and the University of Pennsylvania"
DESCRIPTION = "Beamer themes in the colors of the University of Pennsylvania, \
USA, and Boston College, USA. Both were tested for the \
presentation theme 'Warsaw'. Please note that these color \
themes are neither official nor exact! The colours are \
approximated from the universities' style guidelines and \
websites, and slightly modified where necessary to generate an \
appealing look. The universities neither endorse, nor provide \
any support for, these color themes. I give no warranty for the \
code."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29937"

RPM_NAME = "texlive-beamertheme-upenn-bc-2023.201.1.0svn29937-53.1.noarch.rpm"
RPM_HASH = "5d8a4e81b19d2c67219b1c7905906cd0adf2b0fc403d480613c32897fe0ea3fa720bc3cde810958b427e0d7d1a655e8631aa849ab6c50d6078e14d10b0b7c30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemegoeagles.sty) \
tex(beamercolorthemepenn.sty) \
texlive-beamertheme-upenn-bc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
