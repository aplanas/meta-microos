SUMMARY = "Create glossaries and lists of acronyms"
DESCRIPTION = "The glossaries package supports acronyms and multiple \
glossaries, and has provision for operation in several \
languages (using the facilities of either babel or \
polyglossia). New entries are defined to have a name and \
description (and optionally an associated symbol). Support for \
multiple languages is offered, and plural forms of terms may be \
specified. An additional package, glossaries-accsupp, can make \
use of the accsupp package mechanisms for accessibility support \
for PDF files containing glossaries. The user may define new \
glossary styles, and preambles and postambles can be specified. \
There is provision for loading a database of terms, but only \
terms used in the text will be added to the relevant glossary. \
The package uses an indexing program to provide the actual \
glossary; either makeindex or xindy may serve this purpose, and \
a Perl script is provided to serve as interface. This package \
requires the mfirstuc package. The package supersedes the \
author's glossary package (which is now obsolete)."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.52svn64919"

RPM_NAME = "texlive-glossaries-2023.209.4.52svn64919-54.2.noarch.rpm"
RPM_HASH = "12ff81de41be2ec80fa85a3fb8650108f2e0ec16c6565681649ed2bfd504992b47526bd8fac0d571ae1d9b5ebd8591eac8e33ecc8a1dd42441f6806ba21ded62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-example-glossaries-acronym-desc.tex \
tex-example-glossaries-acronym.tex \
tex-example-glossaries-acronyms-lang.tex \
tex-example-glossaries-brief.tex \
tex-example-glossaries-childmultipar.tex \
tex-example-glossaries-childnoname.tex \
tex-example-glossaries-cite.tex \
tex-example-glossaries-images.tex \
tex-example-glossaries-long.tex \
tex-example-glossaries-longchild.tex \
tex-example-glossaries-multipar.tex \
tex-example-glossaries-parent.tex \
tex-example-glossaries-symbolnames.tex \
tex-example-glossaries-symbols.tex \
tex-example-glossaries-url.tex \
tex-example-glossaries-user.tex \
tex-glossaries-2020-03-19.sty \
tex-glossaries-2021-11-01.sty \
tex-glossaries-accsupp-2020-03-19.sty \
tex-glossaries-accsupp-2021-11-01.sty \
tex-glossaries-accsupp.sty \
tex-glossaries-babel-2020-03-19.sty \
tex-glossaries-babel-2021-11-01.sty \
tex-glossaries-babel.sty \
tex-glossaries-compatible-207-2020-03-19.sty \
tex-glossaries-compatible-207-2021-11-01.sty \
tex-glossaries-compatible-207.sty \
tex-glossaries-compatible-307-2020-03-19.sty \
tex-glossaries-compatible-307-2021-11-01.sty \
tex-glossaries-compatible-307.sty \
tex-glossaries-polyglossia-2020-03-19.sty \
tex-glossaries-polyglossia-2021-11-01.sty \
tex-glossaries-polyglossia.sty \
tex-glossaries-prefix-2020-03-19.sty \
tex-glossaries-prefix-2021-11-01.sty \
tex-glossaries-prefix.sty \
tex-glossaries.sty \
tex-glossary-hypernav-2020-03-19.sty \
tex-glossary-hypernav-2021-11-01.sty \
tex-glossary-hypernav.sty \
tex-glossary-inline-2020-03-19.sty \
tex-glossary-inline-2021-11-01.sty \
tex-glossary-inline.sty \
tex-glossary-list-2020-03-19.sty \
tex-glossary-list-2021-11-01.sty \
tex-glossary-list.sty \
tex-glossary-long-2020-03-19.sty \
tex-glossary-long-2021-11-01.sty \
tex-glossary-long.sty \
tex-glossary-longbooktabs-2020-03-19.sty \
tex-glossary-longbooktabs-2021-11-01.sty \
tex-glossary-longbooktabs.sty \
tex-glossary-longragged-2020-03-19.sty \
tex-glossary-longragged-2021-11-01.sty \
tex-glossary-longragged.sty \
tex-glossary-mcols-2020-03-19.sty \
tex-glossary-mcols-2021-11-01.sty \
tex-glossary-mcols.sty \
tex-glossary-super-2020-03-19.sty \
tex-glossary-super-2021-11-01.sty \
tex-glossary-super.sty \
tex-glossary-superragged-2020-03-19.sty \
tex-glossary-superragged-2021-11-01.sty \
tex-glossary-superragged.sty \
tex-glossary-tree-2020-03-19.sty \
tex-glossary-tree-2021-11-01.sty \
tex-glossary-tree.sty \
texlive-glossaries"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Std \
perl-strict \
perl-vars \
perl-warnings \
sed \
tex-accsupp.sty \
tex-amsgen.sty \
tex-array.sty \
tex-booktabs.sty \
tex-datatool-base.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-mfirstuc.sty \
tex-multicol.sty \
tex-shellesc.sty \
tex-supertabular.sty \
tex-textcase.sty \
tex-tracklang.sty \
tex-translator.sty \
tex-xfor.sty \
tex-xkeyval.sty \
texlive \
texlive-amsmath \
texlive-datatool \
texlive-etoolbox \
texlive-filesystem \
texlive-glossaries-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mfirstuc \
texlive-scripts \
texlive-scripts-bin \
texlive-tracklang \
texlive-xfor \
texlive-xkeyval"

inherit rpm
