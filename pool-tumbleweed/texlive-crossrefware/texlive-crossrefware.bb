SUMMARY = "Scripts for working with crossref.org"
DESCRIPTION = "This bundle contains the following scripts: bibdoiadd.pl: add \
DOI numbers to papers in a given bib file, bibzbladd.pl: add \
Zbl numbers to papers in a given bib file, bibmradd.pl: add MR \
numbers to papers in a given bib file, bbl2bib.pl: convert \
thebibliography environment to a bib file, biburl2doi.pl: \
convert urls pointing to doi.org to dois ltx2crossrefxml.pl: a \
tool for the creation of XML files for submitting to \
crossref.org. The scripts use bibtexperllibs."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn64754"

RPM_NAME = "texlive-crossrefware-2023.204.svn64754-54.1.noarch.rpm"
RPM_HASH = "3eb7bf740d362841dc18468b0506422be67c0ae793a8e832e4abdcb1d675d0139692bb2013ac8e06fbb313f91919c7e90c02891cb2590d6906b0af40a58a2088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibdoiadd.cfg) \
tex(ltx2crossrefxml.cfg) \
texlive-crossrefware"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(BibTeX::Parser) \
perl(BibTeX::Parser::Author) \
perl(Cwd) \
perl(File::Basename) \
perl(File::Spec) \
perl(FileHandle) \
perl(Getopt::Long) \
perl(Getopt::Std) \
perl(IO::File) \
perl(LWP::Simple) \
perl(LWP::UserAgent) \
perl(LaTeX::ToUnicode) \
perl(POSIX) \
perl(URI::Escape) \
perl(strict) \
perl(utf8) \
perl(warnings) \
sed \
texlive \
texlive-crossrefware-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
