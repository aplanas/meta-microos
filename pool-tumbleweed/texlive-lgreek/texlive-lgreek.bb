SUMMARY = "LaTeX macros for using Silvio Levy's Greek fonts"
DESCRIPTION = "A conversion of Silvio Levy's Plain TeX macros for use with \
LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn21818"

RPM_NAME = "texlive-lgreek-2023.209.svn21818-55.1.noarch.rpm"
RPM_HASH = "e7849ee6727dbb631cdc17b5572e1b2bec5f5b5940e077fb8b3fa4dc9edf64824788e93a1a6e284141d9c89fdce0db067783c8526215e562e90eece35db4798c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGcmr.fd \
tex-LGcmtt.fd \
tex-LGenc.def \
tex-lgreek.sty \
texlive-lgreek"

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
