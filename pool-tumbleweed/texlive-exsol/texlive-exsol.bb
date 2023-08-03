SUMMARY = "Exercises and solutions from the same source, into a book"
DESCRIPTION = "This package provides macros to allow for embedding exercises \
and solutions in the LaTeX source of an instructional text \
(e.g., a book or a course text) while generating the following \
separate documents: your original text that only contains the \
exercises, and a solution book that contains only the solutions \
to the exercises (optionally, the exercises themselves can also \
be copied to the solution book). The exercise data are \
generated when running LaTeX on your document; the first run \
also writes the solutions to a secondary file that may be \
included in a simple document harness, may be processed by \
LaTeX, to generate a nice solution book. The code of the \
package was derived (in large part) from fancyvrb."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn48977"

RPM_NAME = "texlive-exsol-2023.209.1.4svn48977-53.1.noarch.rpm"
RPM_HASH = "478b89a47eedd6218c97b6967040db632f8990bb0a5cc85ffe2e7623f5f75d00adcc1732dc0cd9681a666cf6b306b095725b2a3e98697693adbbd05da82c91e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exsol.sty \
texlive-exsol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-ifmtarg.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-multicol.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
