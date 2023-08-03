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

PV = "2023.209.1.9svn64967"

RPM_NAME = "texlive-texdef-2023.209.1.9svn64967-55.1.noarch.rpm"
RPM_HASH = "da67d521bce89c33028146221690ecf5362fa9c2d9c927d2da9969628bc49c93316aef3fc271721266f077ba88e4e4406bc96d04ee88207c4be1effe6a443add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdef"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
