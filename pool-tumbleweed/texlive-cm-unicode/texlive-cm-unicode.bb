SUMMARY = "Computer Modern Unicode font family"
DESCRIPTION = "Computer Modern Unicode fonts, converted from Metafont sources \
using mftrace with autotrace backend and fontforge. Some \
characters in several fonts are copied from Blue Sky type 1 \
fonts released by AMS. Currently the fonts contain glyphs from \
Latin (Metafont ec, tc, vnr), Cyrillic (lh), Greek (cbgreek \
when available) code sets and IPA extensions (from tipa). This \
font set contains 33 fonts. This archive contains AFM, PFB and \
OTF versions; the OTF version of the Computer Modern Unicode \
fonts works with TeX engines that directly support OpenType \
features, such as XeTeX and LuaTeX."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.7.0svn58661"

RPM_NAME = "texlive-cm-unicode-2023.209.0.0.7.0svn58661-54.1.noarch.rpm"
RPM_HASH = "eff3b481625402e7a68cbc05382b460ab04b1f3f5b919119a0117fcb573547744857820f2a81fa561701999961a09d1949aa66f2c79b767a6607a15732083e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmu-ec.enc \
tex-cmu-ecsc.enc \
tex-cmu-g.enc \
tex-cmu-gsc.enc \
tex-cmu-la.enc \
tex-cmu-lasc.enc \
tex-cmu-lb.enc \
tex-cmu-lc.enc \
tex-cmu-ld.enc \
tex-cmu-rx.enc \
tex-cmu-tc.enc \
tex-cmu-tipa.enc \
tex-cmu-tipx.enc \
tex-cmu-ux.enc \
tex-cmu-uxsc.enc \
tex-cmu-vn.enc \
tex-cmu.map \
texlive-cm-unicode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cm-unicode-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
