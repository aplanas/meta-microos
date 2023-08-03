SUMMARY = "Access different-shaped small-caps fonts"
DESCRIPTION = "This package enables the use of small capitals in different \
font shapes, e.g., slanted or bold slanted for all fonts that \
provide appropriate font shapes. (Note that a separate .fd file \
is needed to define font shapes such as 'scsl' or 'scit'.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn25007"

RPM_NAME = "texlive-slantsc-2023.209.2.11svn25007-58.1.noarch.rpm"
RPM_HASH = "88864dd40333358a874018e03544836657f1bac2721bab03322ee51872ce8d1e82e9821af67ac50fdf647fe88207764b963c6d61bc229f484d7cfb191c1791da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slantsc.sty \
texlive-slantsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
