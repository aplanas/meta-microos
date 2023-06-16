SUMMARY = "Typeset Japanese with Lua(La)TeX"
DESCRIPTION = "The package offers support for typesetting Japanese documents \
with LuaTeX. Either of the Plain and LaTeX2e formats may be \
used with the package."
LICENSE = "BSD-3-Clause"

PV = "2023.201.20230211.0svn65790"

RPM_NAME = "texlive-luatexja-2023.201.20230211.0svn65790-52.1.noarch.rpm"
RPM_HASH = "fbc5a63e7b9a6700764218e63f5a227c4e2bab54bd2897320ded05dbeb198166d8977d68859ac6d6614a7f70c2fb5fd5d265e5b6308f51f53fd49e178b07afd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lltjcore.sty \
tex-lltjdefs.sty \
tex-lltjext.sty \
tex-lltjfont.sty \
tex-lltjp-array.sty \
tex-lltjp-atbegshi.sty \
tex-lltjp-collcell.sty \
tex-lltjp-everyshi.sty \
tex-lltjp-fontspec.sty \
tex-lltjp-footmisc.sty \
tex-lltjp-geometry.sty \
tex-lltjp-listings.sty \
tex-lltjp-microtype.sty \
tex-lltjp-preview.sty \
tex-lltjp-siunitx.sty \
tex-lltjp-stfloats.sty \
tex-lltjp-tascmac.sty \
tex-lltjp-unicode-math.sty \
tex-lltjp-xunicode.sty \
tex-ltj-base.sty \
tex-ltj-kinsoku.tex \
tex-ltj-latex.sty \
tex-ltj-plain.sty \
tex-ltjarticle.cls \
tex-ltjbk10.clo \
tex-ltjbk11.clo \
tex-ltjbk12.clo \
tex-ltjbook.cls \
tex-ltjltxdoc.cls \
tex-ltjreport.cls \
tex-ltjsarticle.cls \
tex-ltjsbook.cls \
tex-ltjsize10.clo \
tex-ltjsize11.clo \
tex-ltjsize12.clo \
tex-ltjskiyou.cls \
tex-ltjspf.cls \
tex-ltjsreport.cls \
tex-ltjtarticle.cls \
tex-ltjtbk10.clo \
tex-ltjtbk11.clo \
tex-ltjtbk12.clo \
tex-ltjtbook.cls \
tex-ltjtreport.cls \
tex-ltjtsize10.clo \
tex-ltjtsize11.clo \
tex-ltjtsize12.clo \
tex-luatexja-adjust.sty \
tex-luatexja-ajmacros.sty \
tex-luatexja-compat.sty \
tex-luatexja-core.sty \
tex-luatexja-fontspec-27c.sty \
tex-luatexja-fontspec.sty \
tex-luatexja-otf.sty \
tex-luatexja-preset.sty \
tex-luatexja-ruby.sty \
tex-luatexja-zhfonts.sty \
tex-luatexja.sty \
texlive-luatexja"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-atbegshi.sty \
tex-collcell.sty \
tex-etoolbox.sty \
tex-everyhook.sty \
tex-everysel.sty \
tex-everyshi.sty \
tex-expl3.sty \
tex-filehook.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-jslogo.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-ltxcmds.sty \
tex-ltxdoc.cls \
tex-luaotfload.sty \
tex-luatexbase-cctb.sty \
tex-luatexbase.sty \
tex-pdftexcmds.sty \
tex-preview.sty \
tex-siunitx.sty \
tex-stfloats.sty \
tex-tascmac.sty \
tex-tuenc.def \
tex-unicode-math.sty \
tex-xkeyval.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luatexbase \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
