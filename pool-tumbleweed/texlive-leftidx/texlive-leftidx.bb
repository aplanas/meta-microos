SUMMARY = "Left and right subscripts and superscripts in math mode"
DESCRIPTION = "Left and right subscripts and superscripts are automatically \
raised for better fitting to the symbol they belong to."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-leftidx-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "da7af9e213c72a4b394acc52000b63f4e3937817c78c1524a593714f89a36aa7014c90e9e88c3b61b280a848ca72edc741eec004f51b54c80a1a1eccf6a7177b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leftidx.sty \
texlive-leftidx"

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
