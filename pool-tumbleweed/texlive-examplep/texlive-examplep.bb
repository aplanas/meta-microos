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

PV = "2023.201.0.0.04svn55265"

RPM_NAME = "texlive-examplep-2023.201.0.0.04svn55265-52.1.noarch.rpm"
RPM_HASH = "f2c2cb3bdce228ccf48d4ffb75d5f18b9508b06a1b1c1bdc0e422f40be07ced6543c118af5f1e6d1f6f1775b88318c3c2202b90aa5026426366a0c9adf0c440d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(codep.sty) \
tex(examplep.sty) \
tex(verbfwr.sty) \
texlive-examplep"

RDEPENDS:${PN} += "/bin/sh \
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
