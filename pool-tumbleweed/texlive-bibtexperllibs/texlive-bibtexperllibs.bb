SUMMARY = "BibTeX Perl Libraries"
DESCRIPTION = "This package provides BibTeX related Perl libraries by Gerhard \
Gossen, repacked by Boris Veytsman, for TeX Live and other \
TDS-compliant distributions. The libraries are written in pure \
Perl, so should work out of the box on any architecture. They \
have been packaged here mostly for Boris Veytsman's BibTeX \
suite, but can be used in any other Perl script."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn57137"

RPM_NAME = "texlive-bibtexperllibs-2023.209.1.6svn57137-54.1.noarch.rpm"
RPM_HASH = "8819277b4d80023336138a0e355f63cd72c33f056d2e7fdb686b6044beaceca512c228219e43e9a6799c8ba71b3d8e7a291d1a530b25bbdb1b5fa471de75d134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-BibTeX--Parser \
perl-BibTeX--Parser--Author \
perl-BibTeX--Parser--Entry \
perl-LaTeX--ToUnicode \
perl-LaTeX--ToUnicode--Tables \
texlive-bibtexperllibs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-BibTeX--Parser \
perl-BibTeX--Parser--Author \
perl-BibTeX--Parser--Entry \
perl-Exporter \
perl-LaTeX--ToUnicode \
perl-LaTeX--ToUnicode--Tables \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
