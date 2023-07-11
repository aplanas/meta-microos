SUMMARY = "Define \\global and \\protected commands with \\newcommand"
DESCRIPTION = "The package provides the means of defining \\global and (e-TeX) \
\\protected commands, within the framework of LaTeX's standard \
\\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-2023.201.1.2svn15878-52.2.noarch.rpm"
RPM_HASH = "354d258367409fc1e3749c5342649e0bb3ef3bb79020e6cb0453c9c3190547fa7efbd8c7f35453537f6c5779c1842f24756b726d47c76c6fcb12ecdcc0081351"
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
