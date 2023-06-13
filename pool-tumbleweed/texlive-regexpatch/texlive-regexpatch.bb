SUMMARY = "High level patching of commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
P. Lehmann's etoolbox. The difference between this package and \
its sibling xpatch is that this package sports a very powerful \
\\regexpatchcmd based on the l3regex module of the LaTeX3 \
experimental packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-2023.201.0.0.2fsvn58668-53.1.noarch.rpm"
RPM_HASH = "ae23fbda01a53c42a4bf02d372c30947439e38da82b4f1e94b10044ae5f4afad990325344526291b0e4c7756f46fb839a5102ddc251f118c6919be8ccf49da67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(regexpatch.sty) \
texlive-regexpatch"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
