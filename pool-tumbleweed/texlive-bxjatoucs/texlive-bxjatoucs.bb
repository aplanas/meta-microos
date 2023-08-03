SUMMARY = "Convert Japanese character code to Unicode"
DESCRIPTION = "This package is meant for macro/package developers: It provides \
function-like (fully-expandable) macros that convert a \
character code value in one of several Japanese encodings to a \
Unicode value. Supported source encodings are: ISO-2022-JP \
(jis), EUC-JP (euc), Shift_JIS (sjis), and the Adobe-Japan1 \
glyph set."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn52509"

RPM_NAME = "texlive-bxjatoucs-2023.209.0.0.2svn52509-53.1.noarch.rpm"
RPM_HASH = "d80e4e4aa368cd9bd6a790c550738f6cb72c5e8d33f8f5c4017771713726ab4d4ca36902f78f5abad6c74623190071c3fa8e615e0e5d82bd2547aa97672dae71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjatoucs-cid.tfm \
tex-bxjatoucs-jis.tfm \
tex-bxjatoucs.sty \
texlive-bxjatoucs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
