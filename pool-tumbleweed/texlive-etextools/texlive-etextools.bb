SUMMARY = "E-TeX tools for LaTeX users and package writers"
DESCRIPTION = "The package provides many (purely expandable) tools for LaTeX: \
Extensive list management (csv lists, lists of single \
tokens/characters, etoolbox lists); purely expandable loops \
(csvloop, forcsvloop, etc.); conversion (csvtolist, etc.)); \
addition/deletion (csvadd, listdel, etc.); Expansion and group \
control: \\expandnext, \\ExpandAfterCmds, \\AfterGroup...; Tests \
on tokens, characters and control sequences (\\iffirstchar, \
\\ifiscs, \\ifdefcount, \\@ifchar...); Tests on strings \
(\\ifstrnum, \\ifuppercase, \\DeclareStringFilter...); Purely \
expandable macros with options (\\FE@testopt, \\FE@ifstar) or \
modifiers (\\FE@modifiers); Some purely expandable numerics \
(\\interval, \\locinterplin). The package is dependent on the \
etex and the etoolbox packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415926svn20694"

RPM_NAME = "texlive-etextools-2023.209.3.1415926svn20694-53.1.noarch.rpm"
RPM_HASH = "80255ab13e2a10576ddb3a2bff2a64a84803fb5623731906ba276e37559d6ab1bad400d89f5f9a1d5e7e1bba02681773718de5aede0048b13ae398de59fddf6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etextools.sty \
texlive-etextools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
