SUMMARY = "Allow LaTeX to download files using an external process"
DESCRIPTION = "The package allows the user to download files (using cURL or \
wget), from within a document. To run the external commands, \
LaTeX (or whatever) needs to be run with the --shell-escape \
flag; this creates a tension between your needs and the \
security implications of the flag; users should exercise due \
caution."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52257"

RPM_NAME = "texlive-download-2023.209.1.2svn52257-53.1.noarch.rpm"
RPM_HASH = "63b699761e21e9ef46a19bc6551773e47e8ceed99de7912a4fbdc27260b13dbca37b8b253a26826fa811f744f4f7864c672c3bcd22c27b68cbdc20b2bfe5e583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-download.sty \
texlive-download"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pdftexcmds.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
