SUMMARY = "Urdu translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Urdu translations \
of the Holy Quran. It adds eight Urdu translations to the quran \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-2023.209.0.0.21svn57597-54.2.noarch.rpm"
RPM_HASH = "f9665febd4cb42242150d8ed289a0d164c6a7320b238230e9f2f3de74510291622d9de959012dc35a18ad36623dca797272f8dab9c25128158dea56fcaf9f07d"
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
