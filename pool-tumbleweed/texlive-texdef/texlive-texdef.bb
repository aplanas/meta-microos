SUMMARY = "Display the definitions of TeX commands"
DESCRIPTION = "This (Perl) script displays the definitions of (La)TeX command \
sequences/macros. Various options allow the selection of the \
used class as well as package files and other factors that may \
influence the definition (before/after the preamble, inside an \
environment, ...). The script creates a temporary TeX file \
which is then compiled using (La)TeX to find the '\\meaning' of \
the command sequence. The result is formatted and presented to \
the user. Length or number command sequences (dimensions, \
\\char..., count registers, ...) are recognized and the \
contained value is also shown (using \\the). Special definitions \
like protected macros are also recognized and the underlying \
macros are shown as well. The script will show plain TeX \
definitions by default. LaTeX and ConTeXt are supported, \
including flavours (pdf(La)TeX, Lua(La)TeX, Xe(La)TeX, ...). \
The flavour can be selected using a command line option, or via \
the script name: latexdef will use LaTeX as default, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.9svn64967"

RPM_NAME = "texlive-texdef-2023.201.1.9svn64967-54.1.noarch.rpm"
RPM_HASH = "91a4b826d08f6449ca2d34e409181f093875c93da6421752705440c1045bb06d324c1f43e1086a65dae80588ffdf154faf81a2bba3f43e29ee5d35f9df4592bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdef"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Temp \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texdef-bin"

inherit rpm
