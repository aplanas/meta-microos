SUMMARY = "Shadow boxes"
DESCRIPTION = "Defines a command \\shabox (analgous to \\fbox), and supporting \
mechanisms."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20312"

RPM_NAME = "texlive-shadow-2023.209.svn20312-54.1.noarch.rpm"
RPM_HASH = "76ebd457877ad8577cc99a634309b479952fa60a00ef120227436cb77174e097d3887f6baebc5e72b1d2ec2832a3f4edfd671d9407806c2272e3b0d38a9e3890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shadow.sty \
texlive-shadow"

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
