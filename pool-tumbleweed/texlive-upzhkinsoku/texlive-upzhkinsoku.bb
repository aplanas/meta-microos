SUMMARY = "Supplementary Chinese kinsoku for Unicode *pTeX"
DESCRIPTION = "This package provides supplementary Chinese kinsoku (line \
breaking rules etc.) settings for Unicode (e-)upTeX (when using \
Unicode as its internal encoding), and ApTeX. Both LaTeX and \
plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.5svn47354"

RPM_NAME = "texlive-upzhkinsoku-2023.209.0.0.5svn47354-54.1.noarch.rpm"
RPM_HASH = "bc8a7e3cf90b2312dd08cfa4d1d40e9a71fb4218922cadfab656afe8e054c563e142b59bcc17f4a6b6fa693a564dea0c37d48fc22bf0da00d7471717499901c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upzhkinsoku.sty \
texlive-upzhkinsoku"

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
