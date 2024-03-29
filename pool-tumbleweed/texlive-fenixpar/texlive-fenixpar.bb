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

PV = "2023.209.0.0.92svn24730"

RPM_NAME = "texlive-fenixpar-2023.209.0.0.92svn24730-53.1.noarch.rpm"
RPM_HASH = "74ad207c3248c3002c3ac21d844f276e2ed4676312c440bc002a57fa956a8a8bc6a736a04ff42294860343ff4e99af9a842924f64c670b99c2f4263922d4b35b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fenixpar.sty \
tex-fenixtok.sty \
texlive-fenixpar"

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
