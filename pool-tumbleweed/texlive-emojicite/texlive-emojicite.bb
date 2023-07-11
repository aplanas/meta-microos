SUMMARY = "Add emojis to citations"
DESCRIPTION = "This package adds emojis to citations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-2023.201.0.0.3svn55131-53.2.noarch.rpm"
RPM_HASH = "de8807794eebd0a36e8ccfc9ca1ca2e73aa3517f9c4a99f6ae64630eeeb52a9baf2d36322c1607d3778e0ce99e758da2041c0739a82d7435156b10351573b38a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emojicite.sty \
texlive-emojicite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-emoji.sty \
tex-natbib.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
