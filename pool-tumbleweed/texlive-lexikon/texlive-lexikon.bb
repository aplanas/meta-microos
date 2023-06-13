SUMMARY = "Macros for a two language dictionary"
DESCRIPTION = "The lexikon package"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn17364"

RPM_NAME = "texlive-lexikon-2023.201.1.0csvn17364-54.1.noarch.rpm"
RPM_HASH = "16dd3ff4156e13ba276ecf83ec400edb143620c447c3e0eb7d9c780dce69e4dd9778d27069d512e3d165e5496caf63e7afbc6d1d6645606139a25ef80e05cee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lexikon.sty) \
texlive-lexikon"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ipa.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
