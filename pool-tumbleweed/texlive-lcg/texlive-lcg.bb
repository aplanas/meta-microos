SUMMARY = "Generate random integers"
DESCRIPTION = "The lcg package generates random numbers (integers) via a \
linear congruential generator (Schrage's method). The random \
numbers are written to a counter. The keyval package is used \
for the user to provide values for the range and a seed, and \
for the name of the counter to be used."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn31474"

RPM_NAME = "texlive-lcg-2023.209.1.3svn31474-55.1.noarch.rpm"
RPM_HASH = "45228cfc6c48136fe84878bfc825e3ccaf41afbcfa4af08b9f2e2fd1c90499a6435a434641f12031184194a5345d46dcec97370f6d9ffcb4c8f2333780aa0e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lcg.sty \
texlive-lcg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
