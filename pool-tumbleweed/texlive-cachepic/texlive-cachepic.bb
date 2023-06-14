SUMMARY = "Convert document fragments into graphics"
DESCRIPTION = "The bundle simplifies and automates conversion of document \
fragments into external EPS or PDF files. The bundle consists \
of two parts: a LaTeX package that implements a document level \
interface, and a command line tool (written in lua) that \
generates the external graphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26313"

RPM_NAME = "texlive-cachepic-2023.201.1.0svn26313-52.1.noarch.rpm"
RPM_HASH = "47fac0265ec73498e7b83222a755df787d1122a9e2a366c8d42fdcbbe3aaf7e41c634a564c9de84971705dfd2c7a8dae903a3bd11b84f06600f11044ef94ce1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cachepic.sty \
tex-prcachepic.def \
texlive-cachepic"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-verbatim.sty \
texlive \
texlive-cachepic-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
