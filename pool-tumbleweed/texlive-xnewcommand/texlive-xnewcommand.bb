SUMMARY = "Define \\global and \\protected commands with \\newcommand"
DESCRIPTION = "The package provides the means of defining \\global and (e-TeX) \
\\protected commands, within the framework of LaTeX's standard \
\\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-2023.209.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "0bccce2716de7e65e15d0960a36bfa861c86fe14ed41b5d3421269684efcfbf1d7b11d454b214802612c370a5f3a4cd53c316de7f302a7252f0614314035ccc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xnewcommand.sty \
texlive-xnewcommand"

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
