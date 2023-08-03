SUMMARY = "Left and right subscripts and superscripts in math mode"
DESCRIPTION = "Left and right subscripts and superscripts are automatically \
raised for better fitting to the symbol they belong to."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-leftidx-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "7f71c1b81a91ff52a2b08fb3680631f45b353081e57e6706c0ed8c670e97a6f3b1d90207097c8f25917d59f2a4e6a882fe10c87a43d13f3aca25fde8c2072c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leftidx.sty \
texlive-leftidx"

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
