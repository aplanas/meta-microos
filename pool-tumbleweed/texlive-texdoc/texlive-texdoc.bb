SUMMARY = "Documentation access for TeX Live"
DESCRIPTION = "texdoc is a Lua script providing easy access to the \
documentation in TeX Live: PDF, DVI, plain text files, and \
more. Viewing and other configuration can be extensively \
customized. It is distributed with TeX Live; MiKTeX provides a \
program by the same name to do the same job, but its \
implementation is unrelated."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.0.1svn66227"

RPM_NAME = "texlive-texdoc-2023.201.4.0.1svn66227-54.1.noarch.rpm"
RPM_HASH = "0a86497d9143e889ace50127c2b861596f458fd9052754364fe688a1c19dac0a7938563cda3d728ccbc8c43f30d6cef6ca83ddb0bc773e6d178925ed97f1a2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdoc.cnf \
texlive-texdoc"

RDEPENDS:${PN} += "/bin/sh \
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
