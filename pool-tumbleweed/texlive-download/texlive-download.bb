SUMMARY = "Allow LaTeX to download files using an external process"
DESCRIPTION = "The package allows the user to download files (using cURL or \
wget), from within a document. To run the external commands, \
LaTeX (or whatever) needs to be run with the --shell-escape \
flag; this creates a tension between your needs and the \
security implications of the flag; users should exercise due \
caution."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52257"

RPM_NAME = "texlive-download-2023.201.1.2svn52257-52.1.noarch.rpm"
RPM_HASH = "5c3ea0030278e07e9cd7773723071687de35ea99433d6808724ae35e40dfc1576015239beca542d5d9897b109fad66d789decb4501c2095bf98798f53c8a3eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-download.sty \
texlive-download"

RDEPENDS:${PN} += "/bin/sh \
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
