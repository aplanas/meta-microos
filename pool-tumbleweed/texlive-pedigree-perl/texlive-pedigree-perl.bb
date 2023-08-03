SUMMARY = "Generate TeX pedigree files from CSV files"
DESCRIPTION = "This program generates TeX commands to typeset pedigrees -- \
either TeX fragments or full LaTeX files, to be processed by \
the authors' pst-pdgr package. The program has support for \
multilanguage pedigrees (at the present moment the English and \
Russian languages are supported)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn64227"

RPM_NAME = "texlive-pedigree-perl-2023.209.2.1svn64227-52.1.noarch.rpm"
RPM_HASH = "cf3455690146d69840ead04a6a2888a613b4db22c3b3189f14398b7812ea736bdb0810e3c7102984ebb5034aaa6c9db2550da46efcf55ba2f728dbc5dea274d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pedigree \
perl-Pedigree--AbortionNode \
perl-Pedigree--Area \
perl-Pedigree--ChildlessNode \
perl-Pedigree--Language \
perl-Pedigree--MarriageNode \
perl-Pedigree--Node \
perl-Pedigree--Parser \
perl-Pedigree--PersonNode \
perl-Pedigree--TwinsNode \
texlive-pedigree-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-FileHandle \
perl-Getopt--Std \
perl-strict \
perl-vars \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pedigree-perl-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
