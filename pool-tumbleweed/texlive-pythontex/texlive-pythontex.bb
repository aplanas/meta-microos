SUMMARY = "Run Python from within a document, typesetting the results"
DESCRIPTION = "The package allows you to enter Python code within a LaTeX \
document, execute the code, and access its output in the \
original document. There is also support for Bash, JavaScript, \
Julia, Octave, Perl, R, Raku (Perl 6), Ruby, Rust, and \
SageMath. Code is only executed when it has been modified, or \
when it meets user-specified criteria. Code may be divided into \
user-defined sessions, which automatically run in parallel. \
Errors and warnings are synchronized with the LaTeX document, \
so that they refer to the document's line numbers. External \
dependencies can be tracked, so that code is re-executed when \
the data it depends on is modified. PythonTeX also provides \
syntax highlighting for code in LaTeX documents via the \
Pygments syntax highlighter. The package provides a depythontex \
utility. This creates a copy of the document in which all \
Python code has been replaced by its output. This is useful for \
journal submissions, sharing documents, and conversion to other \
formats."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn59514"

RPM_NAME = "texlive-pythontex-2023.201.0.0.18svn59514-53.2.noarch.rpm"
RPM_HASH = "b5131406a15fce4bf2d604b3eb865f08d7a2ba9b2a423f3e91ab23e2ef8ece6eb1419c17dbd32fccafeb702d04bb2995a5e36a3f96b4fc96dee8f7a745b3052e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pythontex.sty \
texlive-pythontex"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-etoolbox.sty \
tex-fvextra.sty \
tex-newfloat.sty \
tex-pgfopts.sty \
tex-upquote.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pythontex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
