SUMMARY = "LaTeX classes and packages for Chinese typesetting"
DESCRIPTION = "ctex is a collection of macro packages and document classes for \
LaTeX Chinese typesetting."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.5.10svn66115"

RPM_NAME = "texlive-ctex-2023.204.2.5.10svn66115-54.1.noarch.rpm"
RPM_HASH = "e00e04c356aab3bad14666e37e19c1baae82332d1b342ad30dbcd87b6f32ed820b7712a69f2781678b8cd1a20f19a21ba3274b896b18860c425d68a9b0d7d193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-c19rm.fd \
tex-c19sf.fd \
tex-c19tt.fd \
tex-c70rm.fd \
tex-c70sf.fd \
tex-c70tt.fd \
tex-ctex-c5size.clo \
tex-ctex-cs4size.clo \
tex-ctex-engine-aptex.def \
tex-ctex-engine-luatex.def \
tex-ctex-engine-pdftex.def \
tex-ctex-engine-uptex.def \
tex-ctex-engine-xetex.def \
tex-ctex-fontset-adobe.def \
tex-ctex-fontset-fandol.def \
tex-ctex-fontset-founder.def \
tex-ctex-fontset-mac.def \
tex-ctex-fontset-macnew.def \
tex-ctex-fontset-macold.def \
tex-ctex-fontset-ubuntu.def \
tex-ctex-fontset-windows.def \
tex-ctex-heading-article.def \
tex-ctex-heading-beamer.def \
tex-ctex-heading-book.def \
tex-ctex-heading-report.def \
tex-ctex-name-gbk.cfg \
tex-ctex-name-utf8.cfg \
tex-ctex-scheme-chinese-article.def \
tex-ctex-scheme-chinese-beamer.def \
tex-ctex-scheme-chinese-book.def \
tex-ctex-scheme-chinese-report.def \
tex-ctex-scheme-chinese.def \
tex-ctex-scheme-plain-article.def \
tex-ctex-scheme-plain-beamer.def \
tex-ctex-scheme-plain-book.def \
tex-ctex-scheme-plain-report.def \
tex-ctex-scheme-plain.def \
tex-ctex-spa-macro.tex \
tex-ctex-spa-make.tex \
tex-ctex-zhmap-adobe.tex \
tex-ctex-zhmap-fandol.tex \
tex-ctex-zhmap-founder.tex \
tex-ctex-zhmap-mac.tex \
tex-ctex-zhmap-ubuntu.tex \
tex-ctex-zhmap-windows.tex \
tex-ctex.cfg \
tex-ctex.sty \
tex-ctexart.cls \
tex-ctexbackend.cfg \
tex-ctexbeamer.cls \
tex-ctexbook.cls \
tex-ctexcap.sty \
tex-ctexheading.sty \
tex-ctexhook.sty \
tex-ctexopts.cfg \
tex-ctexpatch.sty \
tex-ctexrep.cls \
tex-ctexsize.sty \
tex-ctexspa.def \
tex-ctxdoc.cls \
tex-ctxdocstrip.tex \
tex-jt2zhrm.fd \
tex-jt2zhsf.fd \
tex-jt2zhtt.fd \
tex-jy2zhrm.fd \
tex-jy2zhsf.fd \
tex-jy2zhtt.fd \
texlive-ctex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJK.sty \
tex-CJKfntef.sty \
tex-CJKpunct.sty \
tex-CJKspace.sty \
tex-CJKutf8.sty \
tex-caption.sty \
tex-everysel.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-fancyvrb-ex.sty \
tex-fix-cm.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-indentfirst.sty \
tex-l3doc.cls \
tex-l3keys2e.sty \
tex-lltjp-listings.sty \
tex-luatexja.sty \
tex-makecell.sty \
tex-multitoc.sty \
tex-pxeverysel.sty \
tex-siunitx.sty \
tex-tabularx.sty \
tex-threeparttable.sty \
tex-unicode-math.sty \
tex-xCJK2uni.sty \
tex-xcolor.sty \
tex-xeCJK.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
tex-xunicode-addon.sty \
tex-zhnumber.sty \
tex-zref-base.sty \
texlive \
texlive-adobemapping \
texlive-atbegshi \
texlive-beamer \
texlive-cjk \
texlive-cjkpunct \
texlive-ec \
texlive-epstopdf-pkg \
texlive-etoolbox \
texlive-everyhook \
texlive-fandol \
texlive-filesystem \
texlive-fontspec \
texlive-iftex \
texlive-infwarerr \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvoptions \
texlive-kvsetkeys \
texlive-latex-bin \
texlive-ltxcmds \
texlive-luatexja \
texlive-mptopdf \
texlive-ms \
texlive-pdftexcmds \
texlive-platex-tools \
texlive-scripts \
texlive-scripts-bin \
texlive-svn-prov \
texlive-tipa \
texlive-tools \
texlive-ttfutils \
texlive-ulem \
texlive-uplatex \
texlive-xcjk2uni \
texlive-xecjk \
texlive-xetex \
texlive-xkeyval \
texlive-xpinyin \
texlive-xunicode \
texlive-zhmetrics \
texlive-zhmetrics-uptex \
texlive-zhnumber"

inherit rpm
