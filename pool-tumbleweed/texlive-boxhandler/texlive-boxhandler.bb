SUMMARY = "Flexible Captioning and Deferred Box/List Printing"
DESCRIPTION = "The package allows the user to optimise presentation of LaTeX \
tables and figures. Boxhandler will lay out table and figure \
captions with a variety of stylistic apperances, and will also \
allow figures and tables to be 'wrapped' in a manner consistent \
with many business and government documents. For a document \
that might appear in different venues with different \
formatting, boxhandler permits the creation of a LaTeX source \
document that can, with a single-line change in the source \
code, produce an output that has very different layout from the \
baseline configuration, not only in terms of caption style, but \
more importantly in terms of the locations where figures, \
tables and lists appear (or not) in the document. Deferral \
routines also allow one to keep all figure and table data in a \
separate source file, while nonetheless producing a document \
with figures and tables appearing in the desired location."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn28031"

RPM_NAME = "texlive-boxhandler-2023.209.1.30svn28031-53.1.noarch.rpm"
RPM_HASH = "c0f542918494b4a03bf18ea14a6903ab4bbf2dbfc510dc74f7d8ea3dee6b7e949cd773f37167432cd581bf5df4d775c6647d2373583a0fa0fd13ff3e144e4158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boxhandler.sty \
texlive-boxhandler"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
