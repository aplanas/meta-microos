SUMMARY = "Old style numbers in OT1 encoding"
DESCRIPTION = "Font information needed to load the cmmi and cmmib fonts for \
use to produce oldstyle numbers."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-oldstyle-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "a74c76f824403b523df0ff0a9074b3c581393fd1ad8f8fc7158f7ef87014c64faebd872d319305cc68c8db9bf0679e9296d7e6594a71db41c31798a1bfd23b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ucmm.fd \
tex-oldstyle.sty \
texlive-oldstyle"

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
