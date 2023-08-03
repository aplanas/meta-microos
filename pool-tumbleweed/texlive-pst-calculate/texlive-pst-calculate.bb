SUMMARY = "Support for floating point operations at LaTeX level"
DESCRIPTION = "This package provides an interface to the LaTeX3 floating point \
unit (part of expl3), mainly used for PSTricks related packages \
to allow math expressions at LaTeX level. siunitx is used for \
formatting the calculated number. The package also depends on \
xkeyval and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn49817"

RPM_NAME = "texlive-pst-calculate-2023.209.0.0.02svn49817-53.1.noarch.rpm"
RPM_HASH = "d1a00226b71d66e3b0d6b90d2dc36781779ad2c511ffa018d07307ed16c7a937ce86861e077050c5c3ea72691f77fdffce2f06629aff633f720b2073538dde9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-calculate.sty \
texlive-pst-calculate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-siunitx.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
