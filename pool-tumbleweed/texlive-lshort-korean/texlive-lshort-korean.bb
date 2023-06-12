SUMMARY = "Korean introduction to LaTeX"
DESCRIPTION = "A translation of Oetiker's original (not so) short \
introduction."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.svn58468"

RPM_NAME = "texlive-lshort-korean-2023.201.svn58468-54.1.noarch.rpm"
RPM_HASH = "7f8c76c5e5344685e6114ddd6ae2beccb5944b410c398f0ed734b0480d942255e7633f52e8365d24cf83c0f1f7d7c7ecdc9876e7a40ecc564bc9b97791c7997b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-korean"
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
