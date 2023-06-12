SUMMARY = "Generate TeX pedigree files from CSV files"
DESCRIPTION = "This program generates TeX commands to typeset pedigrees -- \
either TeX fragments or full LaTeX files, to be processed by \
the authors' pst-pdgr package. The program has support for \
multilanguage pedigrees (at the present moment the English and \
Russian languages are supported)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn64227"

RPM_NAME = "texlive-pedigree-perl-2023.201.2.1svn64227-51.1.noarch.rpm"
RPM_HASH = "4095e4f25b96c57b53b18b22ecb40706018e88015f0b4cd3082340bac797f5f7113c53535f078ed5209e84f77b8e0c2db5d47e107001b1fcb7236e4e732d3f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Pedigree) \
perl(Pedigree::AbortionNode) \
perl(Pedigree::Area) \
perl(Pedigree::ChildlessNode) \
perl(Pedigree::Language) \
perl(Pedigree::MarriageNode) \
perl(Pedigree::Node) \
perl(Pedigree::Parser) \
perl(Pedigree::PersonNode) \
perl(Pedigree::TwinsNode) \
texlive-pedigree-perl"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(FileHandle) \
perl(Getopt::Std) \
perl(strict) \
perl(vars) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pedigree-perl-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
