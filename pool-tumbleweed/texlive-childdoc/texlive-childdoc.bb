SUMMARY = "Directly compile \\include'd child documents"
DESCRIPTION = "This LaTeX2e package enables the direct compilation of document \
sections included by \\include to individual files."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn49543"

RPM_NAME = "texlive-childdoc-2023.201.2.0svn49543-53.1.noarch.rpm"
RPM_HASH = "361f89f5677e75550625d5d895f88852b31a4af307e3621b8d5982abd2a3e6701861287f5432fa91a02d51f12f2f9bfafe7aba1ec6246a77713662e7e6350dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-childdoc.def \
texlive-childdoc"

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
