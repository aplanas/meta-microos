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

PV = "2023.201.0.0.7.0svn58661"

RPM_NAME = "texlive-cm-unicode-2023.201.0.0.7.0svn58661-53.1.noarch.rpm"
RPM_HASH = "ffefd21974f00f0726e43fa2f376384cf793fae927f608fcc77f1c2a97020357ea61360f513805668905a257459955ed9c09684b5384449c665af725406c1c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmu-ec.enc) \
tex(cmu-ecsc.enc) \
tex(cmu-g.enc) \
tex(cmu-gsc.enc) \
tex(cmu-la.enc) \
tex(cmu-lasc.enc) \
tex(cmu-lb.enc) \
tex(cmu-lc.enc) \
tex(cmu-ld.enc) \
tex(cmu-rx.enc) \
tex(cmu-tc.enc) \
tex(cmu-tipa.enc) \
tex(cmu-tipx.enc) \
tex(cmu-ux.enc) \
tex(cmu-uxsc.enc) \
tex(cmu-vn.enc) \
tex(cmu.map) \
texlive-cm-unicode"

RDEPENDS:${PN} += "/bin/sh \
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
