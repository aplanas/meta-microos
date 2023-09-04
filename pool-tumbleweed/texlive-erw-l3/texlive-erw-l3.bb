SUMMARY = "Utilities based on LaTeX3"
DESCRIPTION = "Utilities based on LaTeX3. Highlight: \\erw_merge_sort."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn61799"

RPM_NAME = "texlive-erw-l3-2023.209.4.2svn61799-54.2.noarch.rpm"
RPM_HASH = "55a06206f6e74b3bd54ef76b9c39f4e1d2bcd9e120c3ff8b86b6b9f2dd875ed34daf50a0ff4b2c3bc0e7b03c117e53b0b4d7d88c3ea7070c0f4f0dfc57f47230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-erw-l3.sty \
texlive-erw-l3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
