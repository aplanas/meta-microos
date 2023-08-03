SUMMARY = "Find the last value of a counter"
DESCRIPTION = "The package records the value that was last set, for any \
counter of interest; since most such counters are simply \
incremented when they are changed, the recorded value will \
usually be the maximum value."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21178"

RPM_NAME = "texlive-totcount-2023.209.1.2svn21178-53.1.noarch.rpm"
RPM_HASH = "72b4aa8d674e4c94b28bdca4e29d0358cb5e24f0b62d863958be28a30947ccaaca09d869bb2ff47b965f436e542b13b0c95f5af093a2fce4b81fb9d134097f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-totcount.sty \
texlive-totcount"

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
