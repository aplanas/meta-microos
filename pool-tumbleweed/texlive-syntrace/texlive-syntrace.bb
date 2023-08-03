SUMMARY = "Labels for tracing in a syntax tree"
DESCRIPTION = "This package adds support for traces in trees created using \
either the synttree or the qtree package. The package provides \
two commands (\\traceLabel and \\traceReference) to set and use a \
trace."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-syntrace-2023.209.1.1svn15878-58.1.noarch.rpm"
RPM_HASH = "7217e81cdf9109ff580f6ea4526b2884f6615753819e71f3e81fa0931b03bf06b20856afd5b0b7ccd9d80d71c56903d87ac0931be3ad36348c58782d929a7944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syntrace.sty \
texlive-syntrace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-qtree.sty \
tex-synttree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
