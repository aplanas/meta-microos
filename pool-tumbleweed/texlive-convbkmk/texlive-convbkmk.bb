SUMMARY = "Correct platex/uplatex bookmarks in PDF created with hyperref"
DESCRIPTION = "The package provides a small Ruby script that corrects \
bookmarks in PDF files created by platex/uplatex, using \
hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.30svn49252"

RPM_NAME = "texlive-convbkmk-2023.209.0.0.30svn49252-55.1.noarch.rpm"
RPM_HASH = "5416e0b7c723dacb609d19c82e2f9d6c009b17201ba0b19a11f197f6c679021cc2bcb194678c0a1956970b21be2eb6790977f4430739f10ffae8e03d86b50dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-convbkmk"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-convbkmk-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
