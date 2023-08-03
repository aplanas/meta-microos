SUMMARY = "A different way to read counters"
DESCRIPTION = "The package offers package or class authors a way to format \
counters with 'patterns'. These patterns do not affect 'normal' \
LaTeX treatment of counters."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn34668"

RPM_NAME = "texlive-cntformats-2023.209.0.0.7svn34668-54.1.noarch.rpm"
RPM_HASH = "1010c2664f884f985876aa989b8c1d66b1b4099f65316d68914aabfe441e66629b8918438696b0557ccb642043d4758defad3d754d02aa6a95da18824cf65983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cntformats.sty \
texlive-cntformats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cnltx-base.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
