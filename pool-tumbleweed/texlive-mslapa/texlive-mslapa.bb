SUMMARY = "Michael Landy's APA citation style"
DESCRIPTION = "LaTeX and BibTeX style files for a respectably close \
approximation to APA (American Psychological Association) \
citation and reference style."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-mslapa-2023.209.svn54080-55.1.noarch.rpm"
RPM_HASH = "81a31046bdab892a3d739bc7f2688b4c3886fea34bfcd3a2d9cbd403c6b8030b0c296c3bc25ade673c17a2f71dfa68d2262127c6f54243bd46ba7ee8933545c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mslapa.sty \
texlive-mslapa"

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
