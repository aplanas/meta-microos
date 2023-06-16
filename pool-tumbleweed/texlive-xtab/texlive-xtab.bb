SUMMARY = "Break tables across pages"
DESCRIPTION = "Xtab is an extended and somewhat improved version of \
supertabular; its xtabular environment provides tables that \
break across pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3fsvn23347"

RPM_NAME = "texlive-xtab-2023.201.2.3fsvn23347-52.1.noarch.rpm"
RPM_HASH = "7a010497b62d7fd451e8e8fe2df23e34b47a8162167a762873c3a0944c999b9da7814a15e85f4dfec80dabd8fc418e1eae12f88829dc8e3e8cec63a6901b25b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtab.sty \
texlive-xtab"

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
