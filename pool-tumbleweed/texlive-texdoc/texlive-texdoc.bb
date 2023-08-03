SUMMARY = "Documentation access for TeX Live"
DESCRIPTION = "texdoc is a Lua script providing easy access to the \
documentation in TeX Live: PDF, DVI, plain text files, and \
more. Viewing and other configuration can be extensively \
customized. It is distributed with TeX Live; MiKTeX provides a \
program by the same name to do the same job, but its \
implementation is unrelated."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.0.1svn66227"

RPM_NAME = "texlive-texdoc-2023.209.4.0.1svn66227-55.1.noarch.rpm"
RPM_HASH = "3d8b7923ccdee343d1e719d0bed2eba6fb60bfac82016d53f216fa425c8e63e3dd972e6803792ea6cc39fb1db278efc71a4443f2257ba5bc9a532610087fae91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdoc.cnf \
texlive-texdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
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
texlive-scripts-bin \
texlive-texdoc-bin"

inherit rpm
