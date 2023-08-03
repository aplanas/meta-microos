SUMMARY = "Verbatim phrases and listings in LaTeX"
DESCRIPTION = "Examplep provides sophisticated features for typesetting \
verbatim source code listings, including the display of the \
source code and its compiled LaTeX or MetaPost output \
side-by-side, with automatic width detection and enabled page \
breaks (in the source), without the need for specifying the \
source twice. Special care is taken that section, page and \
footnote numbers do not interfere with the main document. For \
typesetting short verbatim phrases, a replacement for the \\verb \
command is also provided in the package, which can be used \
inside tables and moving arguments such as footnotes and \
section titles. The listings package is used for syntax \
highlighting. The accompanying codep package and the wrfiles.pl \
Perl script provide a convenient interface to the examplep \
package for authors of manuals. With codep it is possible to \
generate the source code, the LaTeX or MetaPost output and the \
compilable example file from a single source embedded into the \
appropriate place of the .tex document file."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.04svn55265"

RPM_NAME = "texlive-examplep-2023.209.0.0.04svn55265-53.1.noarch.rpm"
RPM_HASH = "39b4f97ea353e55d0d76c6ba9543003c86b3b8c481ed01bd232318db58800245fb10b2b9b0333eaacf0a31e0104924f2171d19d80beafcc8d9cbff3eaf8b6f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codep.sty \
tex-examplep.sty \
tex-verbfwr.sty \
texlive-examplep"

RDEPENDS:${PN} += "/usr/bin/sh \
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
texlive-scripts-bin"

inherit rpm
