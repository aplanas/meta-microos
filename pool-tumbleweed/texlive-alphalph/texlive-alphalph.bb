SUMMARY = "Convert numbers to letters"
DESCRIPTION = "Provides commands \\alphalph and \\AlphAlph. They are like \
\\number but the expansion consists of lowercase and uppercase \
letters respectively (1 to a, 26 to z, 27 to aa, 52 to zz, 53 \
to ba, 702 to zz, 703 to aaa, etc.). Can be used as a \
replacement for LaTeX's \\@alph and \\@Alph macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn53087"

RPM_NAME = "texlive-alphalph-2023.209.2.6svn53087-55.1.noarch.rpm"
RPM_HASH = "046c530102b1aacc6fd20932d80261bae5cc09a9e7ee03495f3e8c16c71a74d9a89f6daf536099b2f15680a5f407874090727f798cc37d423748c2cb7468c936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alphalph.sty \
texlive-alphalph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-intcalc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
