SUMMARY = "A Chinese translation of the asymptote manual"
DESCRIPTION = "This is an (incomplete, simplified) Chinese translation of the \
Asymptote manual."
LICENSE = "LGPL-3.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-asymptote-manual-zh-cn-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "391090aa2f7d2b9be855b65bad0139b2fd45b16ae5d3c0889b6a073c1aff8d42f293e543198bb50ac7c47788beaa6f51fb9973536c7af933022ccbb63b26e065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-manual-zh-cn"

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
