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

PV = "2023.209.0.0.18svn59514"

RPM_NAME = "texlive-pythontex-2023.209.0.0.18svn59514-54.1.noarch.rpm"
RPM_HASH = "6257a6fcd906d300f236cc4daa9a4c601fd003a505ac0495eff01ed2e483e73d28654253eeed6d412ed976c53832d62406e7033847cd3c8c65d765d66c86d798"
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
