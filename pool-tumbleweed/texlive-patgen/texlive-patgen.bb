SUMMARY = "Generate hyphenation patterns"
DESCRIPTION = "Patgen takes a list of hyphenated words and generates a set of \
patterns that can be used by the TeX 82 hyphenation algorithm. \
Patgen was originally written by Frank M. Liang as part of his \
Stanford Ph.D. work, and has always been distributed alongside \
the other programs coming from the Stanford TeX project. It was \
updated in 1991 by Peter Breitenlohner for the new 8-bit \
features of TeX version 3. (These updates related to \
input/output and programming overhead; the actual pattern \
generation algorithms were not changed.) Patgen is currently \
maintained as part of TeX Live."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.4svn66186"

RPM_NAME = "texlive-patgen-2023.209.2.4svn66186-52.1.noarch.rpm"
RPM_HASH = "ec77d27f9e20b0ed6577aed7feaf16de3c4ffbcd725fe0f066391f84cd592964365ac14f56d7c2e3aacedb6319018c92bb50bd608e7d8089b1a4339a54081913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-patgen.1 \
texlive-patgen"

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
texlive-patgen-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
