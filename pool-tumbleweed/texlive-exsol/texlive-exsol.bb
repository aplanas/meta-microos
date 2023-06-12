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

PV = "2023.201.1.4svn48977"

RPM_NAME = "texlive-exsol-2023.201.1.4svn48977-52.1.noarch.rpm"
RPM_HASH = "2c8007700cb8f6a2e3f133a3522d67e0a3a70da615232db629c913c93571af83423900ff0aeba6c0297ffbb0af6b66d0f20c724c067d78f83e3e1dc70a850b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(exsol.sty) \
texlive-exsol"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fancyvrb.sty) \
tex(ifmtarg.sty) \
tex(ifthen.sty) \
tex(kvoptions.sty) \
tex(multicol.sty) \
tex(varwidth.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
