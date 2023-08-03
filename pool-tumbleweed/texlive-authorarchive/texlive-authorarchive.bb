SUMMARY = "Adds self-archiving information to scientific papers"
DESCRIPTION = "This is a LaTeX style for producing author self-archiving \
copies of (academic) papers. The following layout-styles are \
pre-defined: ACMfor the two-column layout used by many ACM \
conferences IEEE for the two-column layout used by many IEEE \
conferences LNCS for the LNCS layout (as used by Springer) LNI \
for the Lecture Notes in Informatics, published by the GI ENTCS \
for the Elsevier ENTCS layout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.0svn65777"

RPM_NAME = "texlive-authorarchive-2023.209.1.3.0svn65777-54.1.noarch.rpm"
RPM_HASH = "28b0a199725d69d5d22166f8b0b6b4bb88b9f1894ae1cf7f4d2401ebac50de961ecdc70be529edd2c8d0f10c095af2f2ffe07bf11258b8ab2615e98ebbf8add1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authorarchive.sty \
texlive-authorarchive"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-enumitem.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-intopdf.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-orcidlink.sty \
tex-qrcode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
