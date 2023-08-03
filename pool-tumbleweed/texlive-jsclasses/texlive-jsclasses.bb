SUMMARY = "Classes tailored for use with Japanese"
DESCRIPTION = "Classes jsarticle and jsbook are provided, together with \
packages okumacro and okuverb. These classes are designed to \
work under ASCII Corporation's Japanese TeX system ptex."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66093"

RPM_NAME = "texlive-jsclasses-2023.209.svn66093-56.1.noarch.rpm"
RPM_HASH = "23f4e60e7dfc4b57daec8644fd45b115dbe5046af972fb3051ca65423d03278eb97737b839e7d47e0f77d3ed48ff5922f89a5822a2fa8b66635d34dcda56944a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jsarticle.cls \
tex-jsbook.cls \
tex-jslogo.sty \
tex-jspf.cls \
tex-jsreport.cls \
tex-jsverb.sty \
tex-kiyou.cls \
tex-minijs.sty \
tex-okumacro.sty \
tex-okuverb.sty \
texlive-jsclasses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ts1enc.def \
tex-type1cm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
