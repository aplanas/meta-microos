SUMMARY = "One-shot changes to token registers such as \\everypar"
DESCRIPTION = "The bundle provides two packages, fenxitok and fenixpar. The \
fenixtok package provides user macros to add material to a \
token register; the material will be (automatically) removed \
from the token register when the register is executed. Material \
may be added either to the left or to the right, and care is \
taken not to override any redefinition that may be included in \
the token register itself. The fenixpar package uses the macros \
of fenixtok to provide a user interface to manipulation of the \
\\everypar token register. The packages require the e-TeX \
extensions; with them, they work either with Plain TeX or with \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn24730"

RPM_NAME = "texlive-fenixpar-2023.201.0.0.92svn24730-52.1.noarch.rpm"
RPM_HASH = "55d2714cc6a6034229cfe74853a2595e03bdb5fd102e123bdca63c39e41bdc2bf8fef58c0f71f9459b2abcd72e739958a0988ca010bab09df8412910abd045b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fenixpar.sty) \
tex(fenixtok.sty) \
texlive-fenixpar"
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
