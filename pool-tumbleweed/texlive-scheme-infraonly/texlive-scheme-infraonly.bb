SUMMARY = "Infrastructure-only scheme (no TeX at all)"
DESCRIPTION = "This is the TeX Live scheme for infrastructure only, with no \
TeX engines at all. It is useful for automated testing, where \
the actual programs and packages to be tested are installed \
separately afterwards, with tlmgr install."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-infraonly-2023.208.svn54191-60.1.noarch.rpm"
RPM_HASH = "2ccf031c625603666cd6773dd9a89a36db3ec66c5742b98bf88b5788ab087886397f57e684aec11eee23d01f0ffcaf1cb95a31db1344613a6843e2d79b375367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-infraonly"

RDEPENDS:${PN} += "texlive-hyphen-base \
texlive-kpathsea \
texlive-scripts \
texlive-texlive.infra"

inherit rpm
