SUMMARY = "LaTeX font description files for the CB Greek fonts"
DESCRIPTION = "The package provides font description files for all the many \
shapes available from the cbfonts collection. The files provide \
the means whereby the NFSS knows which fonts a LaTeX user is \
requesting. The package depends on cbgreek-complete."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54080"

RPM_NAME = "texlive-cbfonts-fd-2023.201.1.2svn54080-52.1.noarch.rpm"
RPM_HASH = "a7a6cff5d58b2b08a002d85c19d3ab64b6d5575812eb19f169056939fed8a3db65636e0f869586842567aa8bd872f3e7ec855f3a38ffeee41228f7d29ef8ab19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lgrcmr.fd) \
tex(lgrcmro.fd) \
tex(lgrcmss.fd) \
tex(lgrcmtt.fd) \
tex(lgrlcmss.fd) \
tex(lgrlcmtt.fd) \
tex(lgrlmr.fd) \
tex(lgrlmro.fd) \
tex(lgrlmss.fd) \
tex(lgrlmtt.fd) \
texlive-cbfonts-fd"

RDEPENDS:${PN} += "/bin/sh \
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
