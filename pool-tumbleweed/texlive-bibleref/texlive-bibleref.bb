SUMMARY = "Format bible citations"
DESCRIPTION = "The bibleref package offers consistent formatting of references \
to parts of the Christian bible, in a number of well-defined \
formats. It depends on ifthen, fmtcount, and amsgen."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.25svn55626"

RPM_NAME = "texlive-bibleref-2023.209.1.25svn55626-54.1.noarch.rpm"
RPM_HASH = "0966939f120683ad51a852045fb2fd5a979132470ea3631a909f1ce14d331e7cf88641cdd6565f460a49b921288d94404cfb3d21865d746cf5f0e9c28b0f976f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-xidx.sty \
tex-bibleref.sty \
texlive-bibleref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsgen.sty \
tex-fmtcount.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
