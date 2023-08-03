SUMMARY = "Urdu translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Urdu translations \
of the Holy Quran. It adds eight Urdu translations to the quran \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-2023.209.0.0.21svn57597-54.1.noarch.rpm"
RPM_HASH = "28a3d2caa1ce15356de745db24a7f7df22593f370eaf16098106e9001a9ce63dfb9399a66018a5f84f7f726a3fab223dec4e8262a3d078d6aca2fa56de4eafe9"
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
