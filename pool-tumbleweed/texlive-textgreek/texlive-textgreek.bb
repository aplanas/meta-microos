SUMMARY = "Upright greek letters in text"
DESCRIPTION = "Use upright greek letters as text symbols, e.g. \\textbeta."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn44192"

RPM_NAME = "texlive-textgreek-2023.209.0.0.7svn44192-55.1.noarch.rpm"
RPM_HASH = "7ac756d12a9536ec465f541f4029371b75c7c363d92a17dfd936630da35c8befb41fed65cb048f81744fb3d6ec0e858b0e237e4aa502fabe3888ee57ad0659c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textgreek.sty \
texlive-textgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-greek-fontenc \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
