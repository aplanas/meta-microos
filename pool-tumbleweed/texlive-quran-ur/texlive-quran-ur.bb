SUMMARY = "Urdu translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Urdu translations \
of the Holy Quran. It adds eight Urdu translations to the quran \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-2023.201.0.0.21svn57597-53.2.noarch.rpm"
RPM_HASH = "2a1dc566f06061df792ae6cf5bfb84e7e4bc8f6cf64e26d6351174fb298fa39908ee0e654f4d27a10a96ddcaea00c5c6539102819d79b79e8bf6b23c8d3e9939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-ur.sty \
tex-qurantext-uri.translation.def \
tex-qurantext-urii.translation.def \
tex-qurantext-uriii.translation.def \
tex-qurantext-uriv.translation.def \
tex-qurantext-urv.translation.def \
tex-qurantext-urvi.translation.def \
tex-qurantext-urvii.translation.def \
tex-qurantext-urviii.translation.def \
texlive-quran-ur"

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
