SUMMARY = "Some macros for writing practical reports"
DESCRIPTION = "This package provides a handful of macros for writing up \
science practical reports."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.3svn52312"

RPM_NAME = "texlive-practicalreports-2023.209.2.0.3svn52312-53.1.noarch.rpm"
RPM_HASH = "0a6e451f42313d37ea1eb1f0a4b4819a997ad67ecea650ffc66e3a5cdfa9e5d48342b81c5dd349258d44d1a22441fca127dacf8fbbd51f287834f4ae916c915a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-practicalreports.sty \
texlive-practicalreports"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-pdfpages.sty \
tex-pgffor.sty \
tex-scrextend.sty \
tex-tikzducks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
