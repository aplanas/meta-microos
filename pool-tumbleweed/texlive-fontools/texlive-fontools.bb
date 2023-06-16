SUMMARY = "Tools to simplify using fonts (especially TT/OTF ones)"
DESCRIPTION = "This package provides tools to simplify using OpenType fonts \
with LaTeX. By far the most important program in this bundle is \
autoinst: autoinst - a wrapper script around Eddie Kohler's \
LCDF TypeTools. Autoinst aims to automate the installation of \
OpenType fonts in LaTeX by calling the LCDF TypeTools (with the \
correct options) for all fonts you wish to install, and \
generating the necessary .fd and .sty files. In addition, this \
bundle contains a few other, less important utilities: afm2afm \
- re-encode .afm files, ot2kpx - extract kerning pairs from \
OpenType fonts, splitttc - split an OpenType Collection file \
(ttc or otc) into individual fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn65706"

RPM_NAME = "texlive-fontools-2023.201.svn65706-52.1.noarch.rpm"
RPM_HASH = "4748e70c663a03cb1462072f063e18ddad72087538b4d19464f40c8ffde5b6b2c872131683fb0803184cfc3365c5dbc966d46575c53442dfcc5890f92912ad9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontools-cs.enc \
tex-fontools-l7x.enc \
tex-fontools-lgr.enc \
tex-fontools-ly1.enc \
tex-fontools-oml.enc \
tex-fontools-ot1.enc \
tex-fontools-qx.enc \
tex-fontools-t1.enc \
tex-fontools-t2a.enc \
tex-fontools-t2b.enc \
tex-fontools-t2c.enc \
tex-fontools-t3.enc \
tex-fontools-t4.enc \
tex-fontools-t5.enc \
tex-fontools-ts1.enc \
tex-fontools-ts3.enc \
texlive-fontools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Path \
perl-File--Spec \
perl-Getopt--Long \
perl-List--Util \
perl-POSIX \
perl-Pod--Usage \
perl-integer \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-fontools-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
