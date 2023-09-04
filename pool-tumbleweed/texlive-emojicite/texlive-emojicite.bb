SUMMARY = "Add emojis to citations"
DESCRIPTION = "This package adds emojis to citations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-2023.209.0.0.3svn55131-54.2.noarch.rpm"
RPM_HASH = "1280f09fdabeb74f6c9e8e7976b57d682eaed80f0fe5bf857738c91710e9bb14b18b15ebe32607ef3af0321e0087df7d7f89994d3193c8f8118fee25cd2b780f"
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
