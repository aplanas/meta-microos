SUMMARY = "Bengali translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Bengali \
translations of the Holy Quran. It adds two Bengali \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-2023.209.0.0.1svn57602-54.2.noarch.rpm"
RPM_HASH = "66b6c041b6c94d71a72339f5f04d12c72bfa7d16f2ee873dbff75d6f8e531a08497f7eea2c516e8e460399ec353c7d23a580bf918449180f145bda5c124432a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-bn.sty \
tex-qurantext-bni.translation.def \
tex-qurantext-bnii.translation.def \
texlive-quran-bn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-quran.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
