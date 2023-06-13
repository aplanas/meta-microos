SUMMARY = "Convert numbers to letters"
DESCRIPTION = "Provides commands \\alphalph and \\AlphAlph. They are like \
\\number but the expansion consists of lowercase and uppercase \
letters respectively (1 to a, 26 to z, 27 to aa, 52 to zz, 53 \
to ba, 702 to zz, 703 to aaa, etc.). Can be used as a \
replacement for LaTeX's \\@alph and \\@Alph macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn53087"

RPM_NAME = "texlive-alphalph-2023.201.2.6svn53087-54.1.noarch.rpm"
RPM_HASH = "eb1183d019eeabc9faff3e43f8b916650e6bd2dc0bc8951daf06ddd027acd0e5b8ca5413b9208e05e9fad96fc09f7ea8c5f9127db9205b46383aaa2d8b5f5ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alphalph.sty) \
texlive-alphalph"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(infwarerr.sty) \
tex(intcalc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
