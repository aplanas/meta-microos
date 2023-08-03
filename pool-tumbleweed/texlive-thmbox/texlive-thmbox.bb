SUMMARY = "Decorate theorem statements"
DESCRIPTION = "The package defines an environment thmbox that presents \
theorems, definitions and similar objects in boxes decorated \
with frames and various aesthetic features. The standard macro \
\\newtheorem may be redefined to use the environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-thmbox-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "11e02f2586bd6ddea23e7669eeeec624eda5664033864c36dce567b313144cf607b1ca690e2ed471d9822735326f3304350a2475f563b81513e90a42c1744bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thmbox.sty \
texlive-thmbox"

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
