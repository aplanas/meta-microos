SUMMARY = "Typeset Subversion keywords"
DESCRIPTION = "A package for incorporating the values of Subversion keywords \
into typeset documents. Information about Subversion (a \
replacement for CVS) is available from the project's home site."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.4svn62157"

RPM_NAME = "texlive-svninfo-2023.209.0.0.7.4svn62157-58.1.noarch.rpm"
RPM_HASH = "99b02f4fa2034c165861daba2caf6e36e841a72b2aaed84129e5a0bc50e91a1314b4758b98c525c1870dc8648e250339a247aa10965746f76e619bf0949bd6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svninfo.cfg \
tex-svninfo.sty \
texlive-svninfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
