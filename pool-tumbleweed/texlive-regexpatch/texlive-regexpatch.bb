SUMMARY = "High level patching of commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
P. Lehmann's etoolbox. The difference between this package and \
its sibling xpatch is that this package sports a very powerful \
\\regexpatchcmd based on the l3regex module of the LaTeX3 \
experimental packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-2023.209.0.0.2fsvn58668-54.1.noarch.rpm"
RPM_HASH = "a06fd0719c0f8ea0d9c71489d616f1cd84a0e7669917e3a67f4d9507fe6a9b94f5c35b0d8974bdde8361a6efa75539e1d9acc2fcc4e970668e77e6f14b2e1bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regexpatch.sty \
texlive-regexpatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
