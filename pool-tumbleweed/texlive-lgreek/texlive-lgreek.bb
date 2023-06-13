SUMMARY = "LaTeX macros for using Silvio Levy's Greek fonts"
DESCRIPTION = "A conversion of Silvio Levy's Plain TeX macros for use with \
LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn21818"

RPM_NAME = "texlive-lgreek-2023.201.svn21818-54.1.noarch.rpm"
RPM_HASH = "50014d7b88b9a10a92179cf96236dc6cb995df65233c57fb6d9fd42649a67d451decce7b3c749fa7a8e6861954e93381e8f0d0c560a901d7eaf971ed58478c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LGcmr.fd) \
tex(LGcmtt.fd) \
tex(LGenc.def) \
tex(lgreek.sty) \
texlive-lgreek"

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
