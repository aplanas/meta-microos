SUMMARY = "Create a .dtx file from a .sty file"
DESCRIPTION = "The package provides a Perl script that converts a .sty file \
(LaTeX package) to .dtx format (documented LaTeX source), by \
surrounding macro definitions with macro and macrocode \
environments. The macro name is automatically inserted as an \
argument to the macro environemnt. Code lines outside macro \
definitions are wrapped only in macrocode environments. Empty \
lines are removed. The script should not be thought to be fool \
proof and 100% accurate but rather as a good start to the \
business of making a .dtx file from an undocumented style file. \
Full .dtx files are generated. A template based on the skeleton \
file from dtxtut is used. User level macros are added \
automatically to the 'Usage' section of the .dtx file. A \
corresponding .ins file can be generated as well."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.4svn64967"

RPM_NAME = "texlive-sty2dtx-2023.201.2.4svn64967-57.1.noarch.rpm"
RPM_HASH = "cd2f2af5e194cece51e4d7cdd6767b4c05b26ee5a0f7cd4a050a00a07915a07eebb2918efb8e2c4318fab8669d00d9cccfd853cfb24a89d04d64646083860384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sty2dtx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-sty2dtx-bin"

inherit rpm
