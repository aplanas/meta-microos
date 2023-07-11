SUMMARY = "Manipulating generalized token lists"
DESCRIPTION = "The package provides tools for simple operations on lists of \
tokens which are not necessarily balanced. It is in particular \
used a lot in the unravel package, to go through tokens one at \
a time rather than having to work with entire braced groups at \
a time. The package requires up-to-date versions of the \
l3kernel, l3kpackages, and l3experimental bundles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn49527"

RPM_NAME = "texlive-gtl-2023.201.0.0.5svn49527-53.2.noarch.rpm"
RPM_HASH = "c5bf4491cc04db6c3db8a56774bb73afbfbbcf24dcec6ddd56adb789902e4723d212200ee9e2921fbf3bf50d62b9362c5ceda2df002ec2204365200172fe8e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtl.sty \
texlive-gtl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3-generic.tex \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
