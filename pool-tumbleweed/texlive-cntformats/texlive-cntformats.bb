SUMMARY = "A different way to read counters"
DESCRIPTION = "The package offers package or class authors a way to format \
counters with 'patterns'. These patterns do not affect 'normal' \
LaTeX treatment of counters."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn34668"

RPM_NAME = "texlive-cntformats-2023.201.0.0.7svn34668-53.1.noarch.rpm"
RPM_HASH = "b09a51b6f5a249d3db22be25057c108e64ec2cfbed108cff2179ee6d9f7a4af52ae5afda7d2d41ee5e4725c6f8dddaa8db06b82770e40fc354bd140950f57dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cntformats.sty) \
texlive-cntformats"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cnltx-base.sty) \
tex(etoolbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
