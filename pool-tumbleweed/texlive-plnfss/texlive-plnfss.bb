SUMMARY = "Font selection for Plain TeX"
DESCRIPTION = "Plnfss is a set of macros to provide easy font access (somewhat \
similar to NFSS but with some limitations) with Plain TeX. \
Plnfss can automatically make use of PSNFSS fd files, i.e., \
when an Adobe Type 1 is used the relevant fd file will be \
loaded automatically. For cmr-like fonts (ec, vnr, csr or plr \
fonts), a special format called pfd (plain fd) is required and \
must be loaded manually. See ot1cmr.pfd for further \
information."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-plnfss-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "1f4e79203b6f38806e1d9c8f772f98a5ff2cf573381f6434d873c6d9803f13efea0023e17c387352205567647c0013cb94f20a625823dee6f743e1033350bccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-MIKmathf.tex \
tex-plnfss.tex \
texlive-plnfss"

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
