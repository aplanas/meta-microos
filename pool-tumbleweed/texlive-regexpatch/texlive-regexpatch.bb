SUMMARY = "High level patching of commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
P. Lehmann's etoolbox. The difference between this package and \
its sibling xpatch is that this package sports a very powerful \
\\regexpatchcmd based on the l3regex module of the LaTeX3 \
experimental packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-2023.209.0.0.2fsvn58668-54.2.noarch.rpm"
RPM_HASH = "f9423e9f47129e77a4a085a77a08f2b6d107ca6f12b69280d4e32d5f88736e5f6885623292ba17fbdb9e2ec92927d7edeb1d18d68ba60a0191770ae5f29382e3"
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
