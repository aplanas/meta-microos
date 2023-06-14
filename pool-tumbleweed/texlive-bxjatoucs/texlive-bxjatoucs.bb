SUMMARY = "Convert Japanese character code to Unicode"
DESCRIPTION = "This package is meant for macro/package developers: It provides \
function-like (fully-expandable) macros that convert a \
character code value in one of several Japanese encodings to a \
Unicode value. Supported source encodings are: ISO-2022-JP \
(jis), EUC-JP (euc), Shift_JIS (sjis), and the Adobe-Japan1 \
glyph set."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn52509"

RPM_NAME = "texlive-bxjatoucs-2023.201.0.0.2svn52509-52.1.noarch.rpm"
RPM_HASH = "b77efd3025598a0d1e07dd10762216a966e17a505b1d9f9d4345c8ae3ef94e33638a4912ee113c186930fb4a8376203ce21688b060608d809d8f2620b6481642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjatoucs-cid.tfm \
tex-bxjatoucs-jis.tfm \
tex-bxjatoucs.sty \
texlive-bxjatoucs"

RDEPENDS:${PN} += "/bin/sh \
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
