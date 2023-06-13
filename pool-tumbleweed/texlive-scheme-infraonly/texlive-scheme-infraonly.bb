SUMMARY = "Infrastructure-only scheme (no TeX at all)"
DESCRIPTION = "This is the TeX Live scheme for infrastructure only, with no \
TeX engines at all. It is useful for automated testing, where \
the actual programs and packages to be tested are installed \
separately afterwards, with tlmgr install."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-infraonly-2023.208.svn54191-58.1.noarch.rpm"
RPM_HASH = "5c5fc00a47e4540908ac92c02f8dc2ea4304842655df5c5730b218ca22cbab222bbc536ee782df3aa8b60a1ecee28c873499610074918316aab4934d15865428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-infraonly"

RDEPENDS:${PN} += "texlive-hyphen-base \
texlive-kpathsea \
texlive-scripts \
texlive-texlive.infra"

inherit rpm
