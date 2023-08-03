SUMMARY = "Macros for use in the author's documentation"
DESCRIPTION = "The package is not advertised for public use, but is necessary \
for the support of others of the author's packages (which are \
compiled under the ltxdoc class)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24500"

RPM_NAME = "texlive-fcltxdoc-2023.209.1.0svn24500-53.1.noarch.rpm"
RPM_HASH = "fa5c5624f522bad2c80c6773428e2c3d73f9232077c29fe26000d06f1376b7e21c2b92efb7dfaaecaf1087b889909d7074d8804bb321823de8ef2a2657ae729c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fcltxdoc.sty \
texlive-fcltxdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amsopn.sty \
tex-amssymb.sty \
tex-array.sty \
tex-bbding.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-delarray.sty \
tex-embedfile.sty \
tex-enumitem.sty \
tex-etexcmds.sty \
tex-etoolbox.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-filehook.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-grffile.sty \
tex-hologo.sty \
tex-hypbmsec.sty \
tex-hypdoc.sty \
tex-hyperref.sty \
tex-interfaces.sty \
tex-lastpage.sty \
tex-linegoal.sty \
tex-listings.sty \
tex-ltxcmds.sty \
tex-ltxnew.sty \
tex-makecell.sty \
tex-manfnt.sty \
tex-marginnote.sty \
tex-moresize.sty \
tex-nccfoots.sty \
tex-nccstretch.sty \
tex-needspace.sty \
tex-pdftexcmds.sty \
tex-relsize.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
