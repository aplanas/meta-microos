SUMMARY = "Print two pages on a single page"
DESCRIPTION = "The package is for printing two pages on a single (landscape) \
A4 page. Page numbers appear on the included pages, and not on \
the landscape 'container' page."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17024"

RPM_NAME = "texlive-twoinone-2023.209.svn17024-53.1.noarch.rpm"
RPM_HASH = "857714c0b8849f25dd6ffa4167c08bab21023f9e32019afe079cf0802fe7a07227883c116868152e8df15b4b31c13ef20bb5933b370c9abf925549f71ce451d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-2in1.sty \
texlive-twoinone"

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
