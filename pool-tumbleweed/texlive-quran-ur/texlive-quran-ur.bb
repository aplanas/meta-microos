SUMMARY = "Urdu translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Urdu translations \
of the Holy Quran. It adds eight Urdu translations to the quran \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-2023.201.0.0.21svn57597-53.1.noarch.rpm"
RPM_HASH = "c0663b4310faffe53e0c34b74ef9658b4a697f84b86e96a6c6d718b1d1906e726878acdae3e52622aa6962b543dd66a0ceb4bae00f5b40be630de118bd34670a"
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
