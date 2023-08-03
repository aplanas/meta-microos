SUMMARY = "Enumerate and itemize within paragraphs"
DESCRIPTION = "Provides enumerate and itemize environments that can be used \
within paragraphs to format the items either as running text or \
as separate paragraphs with a preceding number or symbol. Also \
provides compacted versions of enumerate and itemize."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn43021"

RPM_NAME = "texlive-paralist-2023.209.2.7svn43021-52.1.noarch.rpm"
RPM_HASH = "7eb37179842b20d6408d4bde8f7a2cee18082e53f4472210fbdd3c0fed99f9025bc18e357cc4cfe597db31de9483f824d4a118119ef0b0dcaeb54dbe44c25569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paralist.sty \
texlive-paralist"

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
