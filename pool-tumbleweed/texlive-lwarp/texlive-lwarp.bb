SUMMARY = "Converts LaTeX to HTML"
DESCRIPTION = "This package converts LaTeX to HTML by using LaTeX to process \
the user's document and generate HTML tags. External utility \
programs are only used for the final conversion of text and \
images. Math may be represented by SVG files or MathJax. \
Hundreds of LaTeX packages are supported, and their load order \
is automatically verified. Documents may be produced by LaTeX, \
LuaLaTeX, XeLaTeX, and by several CJK engines, classes, and \
packages. A texlua script automates compilation, index, \
glossary, and batch image processing, and also supports \
latexmk. Configuration is semi-automatic at the first manual \
compile. Support files are self-generated. Print and HTML \
versions of each document may coexist. Assistance is provided \
for HTML import into EPUB conversion software and word \
processors. Requirements include the commonly-available Poppler \
utilities, and Perl. Detailed installation instructions are \
included for each of the major operating systems and TeX \
distributions. A quick-start tutorial is provided."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.911svn66259"

RPM_NAME = "texlive-lwarp-2023.208.0.0.911svn66259-53.1.noarch.rpm"
RPM_HASH = "9dd701ac288f7b97cc0a9c26c6aeab779ece39ea626988c266b94b9cef5a0c12d2430e2ba2735aeeb3c20c2dcd24e815ccdbe1c9c1cca45c19923942a5d47d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lwarp-2in1.sty \
tex-lwarp-2up.sty \
tex-lwarp-CJK.sty \
tex-lwarp-CJKutf8.sty \
tex-lwarp-DotArrow.sty \
tex-lwarp-SIunits.sty \
tex-lwarp-a4.sty \
tex-lwarp-a4wide.sty \
tex-lwarp-a5comb.sty \
tex-lwarp-abstract.sty \
tex-lwarp-academicons.sty \
tex-lwarp-accents.sty \
tex-lwarp-accessibility.sty \
tex-lwarp-accsupp.sty \
tex-lwarp-acro.sty \
tex-lwarp-acronym.sty \
tex-lwarp-addlines.sty \
tex-lwarp-adjmulticol.sty \
tex-lwarp-afterpage.sty \
tex-lwarp-algorithm2e.sty \
tex-lwarp-algorithmicx.sty \
tex-lwarp-alltt.sty \
tex-lwarp-amscdx.sty \
tex-lwarp-amsmath.sty \
tex-lwarp-amsthm.sty \
tex-lwarp-anonchap.sty \
tex-lwarp-anysize.sty \
tex-lwarp-appendix.sty \
tex-lwarp-ar.sty \
tex-lwarp-arabicfront.sty \
tex-lwarp-array.sty \
tex-lwarp-arydshln.sty \
tex-lwarp-asymptote.sty \
tex-lwarp-atbegshi.sty \
tex-lwarp-attachfile.sty \
tex-lwarp-attachfile2.sty \
tex-lwarp-authblk.sty \
tex-lwarp-autobreak.sty \
tex-lwarp-autonum.sty \
tex-lwarp-awesomebox.sty \
tex-lwarp-axessibility.sty \
tex-lwarp-axodraw2.sty \
tex-lwarp-backnaur.sty \
tex-lwarp-backref.sty \
tex-lwarp-balance.sty \
tex-lwarp-bbding.sty \
tex-lwarp-beamerarticle.sty \
tex-lwarp-biblatex.sty \
tex-lwarp-bibunits.sty \
tex-lwarp-bigdelim.sty \
tex-lwarp-bigfoot.sty \
tex-lwarp-bigstrut.sty \
tex-lwarp-bitpattern.sty \
tex-lwarp-blowup.sty \
tex-lwarp-bm.sty \
tex-lwarp-booklet.sty \
tex-lwarp-bookmark.sty \
tex-lwarp-booktabs.sty \
tex-lwarp-bophook.sty \
tex-lwarp-bounddvi.sty \
tex-lwarp-boxedminipage.sty \
tex-lwarp-boxedminipage2e.sty \
tex-lwarp-braket.sty \
tex-lwarp-breakurl.sty \
tex-lwarp-breqn.sty \
tex-lwarp-bsheaders.sty \
tex-lwarp-bussproofs.sty \
tex-lwarp-bxpapersize.sty \
tex-lwarp-bytefield.sty \
tex-lwarp-cancel.sty \
tex-lwarp-canoniclayout.sty \
tex-lwarp-caption.sty \
tex-lwarp-caption3.sty \
tex-lwarp-cases.sty \
tex-lwarp-ccicons.sty \
tex-lwarp-centerlastline.sty \
tex-lwarp-centernot.sty \
tex-lwarp-changebar.sty \
tex-lwarp-changelayout.sty \
tex-lwarp-changepage.sty \
tex-lwarp-changes.sty \
tex-lwarp-chappg.sty \
tex-lwarp-chapterbib.sty \
tex-lwarp-chemfig.sty \
tex-lwarp-chemformula.sty \
tex-lwarp-chemgreek.sty \
tex-lwarp-chemmacros.sty \
tex-lwarp-chemnum.sty \
tex-lwarp-chkfloat.sty \
tex-lwarp-chngpage.sty \
tex-lwarp-cite.sty \
tex-lwarp-citeref.sty \
tex-lwarp-classicthesis.sty \
tex-lwarp-cleveref.sty \
tex-lwarp-clrdblpg.sty \
tex-lwarp-cmbright.sty \
tex-lwarp-cmdtrack.sty \
tex-lwarp-colonequals.sty \
tex-lwarp-color.sty \
tex-lwarp-colortbl.sty \
tex-lwarp-common-mathjax-letters.sty \
tex-lwarp-common-mathjax-newpxtxmath.sty \
tex-lwarp-common-mathjax-nonunicode.sty \
tex-lwarp-common-mathjax-overlaysymbols.sty \
tex-lwarp-common-mathjax-siunitx.sty \
tex-lwarp-common-multimedia.sty \
tex-lwarp-continue.sty \
tex-lwarp-copyrightbox.sty \
tex-lwarp-crop.sty \
tex-lwarp-ctable.sty \
tex-lwarp-cuted.sty \
tex-lwarp-cutwin.sty \
tex-lwarp-dblfloatfix.sty \
tex-lwarp-dblfnote.sty \
tex-lwarp-dcolumn.sty \
tex-lwarp-decimal.sty \
tex-lwarp-decorule.sty \
tex-lwarp-diagbox.sty \
tex-lwarp-dingbat.sty \
tex-lwarp-dotlessi.sty \
tex-lwarp-dprogress.sty \
tex-lwarp-draftcopy.sty \
tex-lwarp-draftfigure.sty \
tex-lwarp-draftwatermark.sty \
tex-lwarp-drftcite.sty \
tex-lwarp-easy-todo.sty \
tex-lwarp-ebook.sty \
tex-lwarp-econometrics.sty \
tex-lwarp-ed.sty \
tex-lwarp-ellipsis.sty \
tex-lwarp-embrac.sty \
tex-lwarp-emptypage.sty \
tex-lwarp-endfloat.sty \
tex-lwarp-endheads.sty \
tex-lwarp-endnotes.sty \
tex-lwarp-engtlc.sty \
tex-lwarp-enotez.sty \
tex-lwarp-enumerate.sty \
tex-lwarp-enumitem.sty \
tex-lwarp-epigraph.sty \
tex-lwarp-epsf.sty \
tex-lwarp-epsfig.sty \
tex-lwarp-epstopdf-base.sty \
tex-lwarp-epstopdf.sty \
tex-lwarp-eqlist.sty \
tex-lwarp-eqparbox.sty \
tex-lwarp-errata.sty \
tex-lwarp-eso-pic.sty \
tex-lwarp-esvect.sty \
tex-lwarp-etoc.sty \
tex-lwarp-eurosym.sty \
tex-lwarp-everypage.sty \
tex-lwarp-everyshi.sty \
tex-lwarp-extarrows.sty \
tex-lwarp-extramarks.sty \
tex-lwarp-fancybox.sty \
tex-lwarp-fancyhdr.sty \
tex-lwarp-fancypar.sty \
tex-lwarp-fancyref.sty \
tex-lwarp-fancytabs.sty \
tex-lwarp-fancyvrb.sty \
tex-lwarp-fbox.sty \
tex-lwarp-fewerfloatpages.sty \
tex-lwarp-figcaps.sty \
tex-lwarp-figsize.sty \
tex-lwarp-fitbox.sty \
tex-lwarp-fix2col.sty \
tex-lwarp-fixmath.sty \
tex-lwarp-fixme.sty \
tex-lwarp-fixmetodonotes.sty \
tex-lwarp-flafter.sty \
tex-lwarp-flippdf.sty \
tex-lwarp-float.sty \
tex-lwarp-floatflt.sty \
tex-lwarp-floatpag.sty \
tex-lwarp-floatrow.sty \
tex-lwarp-fltrace.sty \
tex-lwarp-flushend.sty \
tex-lwarp-fnbreak.sty \
tex-lwarp-fncychap.sty \
tex-lwarp-fnlineno.sty \
tex-lwarp-fnpara.sty \
tex-lwarp-fnpos.sty \
tex-lwarp-fontawesome.sty \
tex-lwarp-fontawesome5.sty \
tex-lwarp-fontaxes.sty \
tex-lwarp-fontenc.sty \
tex-lwarp-footmisc.sty \
tex-lwarp-footnote.sty \
tex-lwarp-footnotebackref.sty \
tex-lwarp-footnotehyper.sty \
tex-lwarp-footnoterange.sty \
tex-lwarp-footnpag.sty \
tex-lwarp-foreign.sty \
tex-lwarp-forest.sty \
tex-lwarp-fouridx.sty \
tex-lwarp-fourier.sty \
tex-lwarp-framed.sty \
tex-lwarp-froufrou.sty \
tex-lwarp-ftcap.sty \
tex-lwarp-ftnright.sty \
tex-lwarp-fullminipage.sty \
tex-lwarp-fullpage.sty \
tex-lwarp-fullwidth.sty \
tex-lwarp-fvextra.sty \
tex-lwarp-fwlw.sty \
tex-lwarp-gensymb.sty \
tex-lwarp-gentombow.sty \
tex-lwarp-geometry.sty \
tex-lwarp-ghsystem.sty \
tex-lwarp-gindex.sty \
tex-lwarp-gloss.sty \
tex-lwarp-glossaries.sty \
tex-lwarp-gmeometric.sty \
tex-lwarp-graphics.sty \
tex-lwarp-graphicx.sty \
tex-lwarp-grffile.sty \
tex-lwarp-grid-system.sty \
tex-lwarp-grid.sty \
tex-lwarp-gridset.sty \
tex-lwarp-hang.sty \
tex-lwarp-hanging.sty \
tex-lwarp-hepunits.sty \
tex-lwarp-hhline.sty \
tex-lwarp-hhtensor.sty \
tex-lwarp-hypbmsec.sty \
tex-lwarp-hypcap.sty \
tex-lwarp-hypdestopt.sty \
tex-lwarp-hypernat.sty \
tex-lwarp-hyperref.sty \
tex-lwarp-hyperxmp.sty \
tex-lwarp-hyphenat.sty \
tex-lwarp-idxlayout.sty \
tex-lwarp-ifoddpage.sty \
tex-lwarp-imakeidx.sty \
tex-lwarp-index.sty \
tex-lwarp-inputtrc.sty \
tex-lwarp-intopdf.sty \
tex-lwarp-isomath.sty \
tex-lwarp-isotope.sty \
tex-lwarp-jurabib.sty \
tex-lwarp-karnaugh-map.sty \
tex-lwarp-keyfloat.sty \
tex-lwarp-keystroke.sty \
tex-lwarp-kpfonts-otf.sty \
tex-lwarp-kpfonts.sty \
tex-lwarp-layaureo.sty \
tex-lwarp-layout.sty \
tex-lwarp-layouts.sty \
tex-lwarp-leading.sty \
tex-lwarp-leftidx.sty \
tex-lwarp-letterspace.sty \
tex-lwarp-lettrine.sty \
tex-lwarp-libertinust1math.sty \
tex-lwarp-lineno.sty \
tex-lwarp-lips.sty \
tex-lwarp-lipsum.sty \
tex-lwarp-listings.sty \
tex-lwarp-listliketab.sty \
tex-lwarp-lltjext.sty \
tex-lwarp-lltjp-siunitx.sty \
tex-lwarp-lltjp-tascmac.sty \
tex-lwarp-longtable.sty \
tex-lwarp-lpic.sty \
tex-lwarp-lscape.sty \
tex-lwarp-ltablex.sty \
tex-lwarp-ltcaption.sty \
tex-lwarp-ltxgrid.sty \
tex-lwarp-ltxtable.sty \
tex-lwarp-lua-check-hyphen.sty \
tex-lwarp-lua-visual-debug.sty \
tex-lwarp-luacolor.sty \
tex-lwarp-luamplib.sty \
tex-lwarp-luatexko.sty \
tex-lwarp-luatodonotes.sty \
tex-lwarp-luavlna.sty \
tex-lwarp-lyluatex.sty \
tex-lwarp-magaz.sty \
tex-lwarp-makeidx.sty \
tex-lwarp-manyfoot.sty \
tex-lwarp-marginal.sty \
tex-lwarp-marginfit.sty \
tex-lwarp-marginfix.sty \
tex-lwarp-marginnote.sty \
tex-lwarp-marvosym.sty \
tex-lwarp-mathalpha.sty \
tex-lwarp-mathastext.sty \
tex-lwarp-mathcomp.sty \
tex-lwarp-mathdesign.sty \
tex-lwarp-mathdots.sty \
tex-lwarp-mathfixs.sty \
tex-lwarp-mathpazo.sty \
tex-lwarp-mathptmx.sty \
tex-lwarp-mathspec.sty \
tex-lwarp-mathtools.sty \
tex-lwarp-mattens.sty \
tex-lwarp-maybemath.sty \
tex-lwarp-mcaption.sty \
tex-lwarp-mdframed.sty \
tex-lwarp-mdwmath.sty \
tex-lwarp-media9.sty \
tex-lwarp-memhfixc.sty \
tex-lwarp-menukeys.sty \
tex-lwarp-metalogo.sty \
tex-lwarp-metalogox.sty \
tex-lwarp-mhchem.sty \
tex-lwarp-microtype.sty \
tex-lwarp-midfloat.sty \
tex-lwarp-midpage.sty \
tex-lwarp-minibox.sty \
tex-lwarp-minitoc.sty \
tex-lwarp-minted.sty \
tex-lwarp-mismath.sty \
tex-lwarp-mleftright.sty \
tex-lwarp-morefloats.sty \
tex-lwarp-moreverb.sty \
tex-lwarp-movie15.sty \
tex-lwarp-mparhack.sty \
tex-lwarp-multibib.sty \
tex-lwarp-multicap.sty \
tex-lwarp-multicol.sty \
tex-lwarp-multicolrule.sty \
tex-lwarp-multimedia.sty \
tex-lwarp-multiobjective.sty \
tex-lwarp-multirow.sty \
tex-lwarp-multitoc.sty \
tex-lwarp-musicography.sty \
tex-lwarp-mwe.sty \
tex-lwarp-nameauth.sty \
tex-lwarp-nameref.sty \
tex-lwarp-natbib.sty \
tex-lwarp-nccfancyhdr.sty \
tex-lwarp-nccfoots.sty \
tex-lwarp-nccmath.sty \
tex-lwarp-needspace.sty \
tex-lwarp-newpxmath.sty \
tex-lwarp-newtxmath.sty \
tex-lwarp-newtxsf.sty \
tex-lwarp-nextpage.sty \
tex-lwarp-nfssext-cfr.sty \
tex-lwarp-nicefrac.sty \
tex-lwarp-niceframe.sty \
tex-lwarp-nicematrix.sty \
tex-lwarp-noitcrul.sty \
tex-lwarp-nolbreaks.sty \
tex-lwarp-nomencl.sty \
tex-lwarp-nonfloat.sty \
tex-lwarp-nonumonpart.sty \
tex-lwarp-nopageno.sty \
tex-lwarp-notes.sty \
tex-lwarp-notespages.sty \
tex-lwarp-nowidow.sty \
tex-lwarp-ntheorem.sty \
tex-lwarp-octave.sty \
tex-lwarp-orcidlink.sty \
tex-lwarp-overpic.sty \
tex-lwarp-pagegrid.sty \
tex-lwarp-pagenote.sty \
tex-lwarp-pagesel.sty \
tex-lwarp-paralist.sty \
tex-lwarp-parallel.sty \
tex-lwarp-parcolumns.sty \
tex-lwarp-parnotes.sty \
tex-lwarp-parskip.sty \
tex-lwarp-patch-komascript.sty \
tex-lwarp-patch-memoir.sty \
tex-lwarp-pbalance.sty \
tex-lwarp-pbox.sty \
tex-lwarp-pdfcol.sty \
tex-lwarp-pdfcolfoot.sty \
tex-lwarp-pdfcolmk.sty \
tex-lwarp-pdfcolparallel.sty \
tex-lwarp-pdfcolparcolumns.sty \
tex-lwarp-pdfcomment.sty \
tex-lwarp-pdfcrypt.sty \
tex-lwarp-pdflscape.sty \
tex-lwarp-pdfmarginpar.sty \
tex-lwarp-pdfpages.sty \
tex-lwarp-pdfprivacy.sty \
tex-lwarp-pdfrender.sty \
tex-lwarp-pdfsync.sty \
tex-lwarp-pdftricks.sty \
tex-lwarp-pdfx.sty \
tex-lwarp-perpage.sty \
tex-lwarp-pfnote.sty \
tex-lwarp-phfqit.sty \
tex-lwarp-physics.sty \
tex-lwarp-physunits.sty \
tex-lwarp-picinpar.sty \
tex-lwarp-pifont.sty \
tex-lwarp-pinlabel.sty \
tex-lwarp-placeins.sty \
tex-lwarp-plarydshln.sty \
tex-lwarp-plext.sty \
tex-lwarp-plextarydshln.sty \
tex-lwarp-plextcolorbl.sty \
tex-lwarp-plimsoll.sty \
tex-lwarp-prelim2e.sty \
tex-lwarp-prettyref.sty \
tex-lwarp-preview.sty \
tex-lwarp-psfrag.sty \
tex-lwarp-psfragx.sty \
tex-lwarp-pst-eps.sty \
tex-lwarp-pstool.sty \
tex-lwarp-pstricks.sty \
tex-lwarp-pxatbegshi.sty \
tex-lwarp-pxeveryshi.sty \
tex-lwarp-pxfonts.sty \
tex-lwarp-pxftnright.sty \
tex-lwarp-pxjahyper.sty \
tex-lwarp-quotchap.sty \
tex-lwarp-quoting.sty \
tex-lwarp-ragged2e.sty \
tex-lwarp-realscripts.sty \
tex-lwarp-refcheck.sty \
tex-lwarp-register.sty \
tex-lwarp-relsize.sty \
tex-lwarp-repeatindex.sty \
tex-lwarp-repltext.sty \
tex-lwarp-resizegather.sty \
tex-lwarp-returntogrid.sty \
tex-lwarp-rlepsf.sty \
tex-lwarp-rmathbr.sty \
tex-lwarp-rmpage.sty \
tex-lwarp-romanbar.sty \
tex-lwarp-romanbarpagenumber.sty \
tex-lwarp-rotating.sty \
tex-lwarp-rotfloat.sty \
tex-lwarp-rviewport.sty \
tex-lwarp-savetrees.sty \
tex-lwarp-scalefnt.sty \
tex-lwarp-scalerel.sty \
tex-lwarp-schemata.sty \
tex-lwarp-scrextend.sty \
tex-lwarp-scrhack.sty \
tex-lwarp-scrlayer-notecolumn.sty \
tex-lwarp-scrlayer-scrpage.sty \
tex-lwarp-scrlayer.sty \
tex-lwarp-scrpage2.sty \
tex-lwarp-section.sty \
tex-lwarp-sectionbreak.sty \
tex-lwarp-sectsty.sty \
tex-lwarp-selectp.sty \
tex-lwarp-semantic-markup.sty \
tex-lwarp-seqsplit.sty \
tex-lwarp-setspace.sty \
tex-lwarp-shadethm.sty \
tex-lwarp-shadow.sty \
tex-lwarp-shapepar.sty \
tex-lwarp-showidx.sty \
tex-lwarp-showkeys.sty \
tex-lwarp-showlabels.sty \
tex-lwarp-showtags.sty \
tex-lwarp-shuffle.sty \
tex-lwarp-sidecap.sty \
tex-lwarp-sidenotes.sty \
tex-lwarp-simplebnf.sty \
tex-lwarp-siunitx-v2.sty \
tex-lwarp-siunitx.sty \
tex-lwarp-skmath.sty \
tex-lwarp-slantsc.sty \
tex-lwarp-slashed.sty \
tex-lwarp-soul.sty \
tex-lwarp-soulpos.sty \
tex-lwarp-soulutf8.sty \
tex-lwarp-splitbib.sty \
tex-lwarp-splitidx.sty \
tex-lwarp-srcltx.sty \
tex-lwarp-srctex.sty \
tex-lwarp-stabular.sty \
tex-lwarp-stackengine.sty \
tex-lwarp-stackrel.sty \
tex-lwarp-statex2.sty \
tex-lwarp-statistics.sty \
tex-lwarp-statmath.sty \
tex-lwarp-steinmetz.sty \
tex-lwarp-stfloats.sty \
tex-lwarp-struktex.sty \
tex-lwarp-subcaption.sty \
tex-lwarp-subfig.sty \
tex-lwarp-subfigure.sty \
tex-lwarp-subsupscripts.sty \
tex-lwarp-supertabular.sty \
tex-lwarp-svg.sty \
tex-lwarp-swfigure.sty \
tex-lwarp-sympytex.sty \
tex-lwarp-syntonly.sty \
tex-lwarp-tabfigures.sty \
tex-lwarp-tablefootnote.sty \
tex-lwarp-tabls.sty \
tex-lwarp-tabularx.sty \
tex-lwarp-tabulary.sty \
tex-lwarp-tagpdf-base.sty \
tex-lwarp-tagpdf-mc-code-generic.sty \
tex-lwarp-tagpdf-mc-code-lua.sty \
tex-lwarp-tagpdf.sty \
tex-lwarp-tascmac.sty \
tex-lwarp-tcolorbox.sty \
tex-lwarp-tensor.sty \
tex-lwarp-termcal.sty \
tex-lwarp-textarea.sty \
tex-lwarp-textcomp.sty \
tex-lwarp-textfit.sty \
tex-lwarp-textpos.sty \
tex-lwarp-theorem.sty \
tex-lwarp-thinsp.sty \
tex-lwarp-thm-listof.sty \
tex-lwarp-thm-restate.sty \
tex-lwarp-thmbox.sty \
tex-lwarp-thmtools.sty \
tex-lwarp-threadcol.sty \
tex-lwarp-threeparttable.sty \
tex-lwarp-threeparttablex.sty \
tex-lwarp-thumb.sty \
tex-lwarp-thumbs.sty \
tex-lwarp-tikz-imagelabels.sty \
tex-lwarp-tikz.sty \
tex-lwarp-titleps.sty \
tex-lwarp-titleref.sty \
tex-lwarp-titlesec.sty \
tex-lwarp-titletoc.sty \
tex-lwarp-titling.sty \
tex-lwarp-tocbasic.sty \
tex-lwarp-tocbibind.sty \
tex-lwarp-tocdata.sty \
tex-lwarp-tocenter.sty \
tex-lwarp-tocloft.sty \
tex-lwarp-tocstyle.sty \
tex-lwarp-todo.sty \
tex-lwarp-todonotes.sty \
tex-lwarp-topcapt.sty \
tex-lwarp-tram.sty \
tex-lwarp-transparent.sty \
tex-lwarp-trimclip.sty \
tex-lwarp-trivfloat.sty \
tex-lwarp-truncate.sty \
tex-lwarp-turnthepage.sty \
tex-lwarp-twoup.sty \
tex-lwarp-txfonts.sty \
tex-lwarp-txgreeks.sty \
tex-lwarp-typearea.sty \
tex-lwarp-typicons.sty \
tex-lwarp-ulem.sty \
tex-lwarp-umoline.sty \
tex-lwarp-underscore.sty \
tex-lwarp-unicode-math.sty \
tex-lwarp-units.sty \
tex-lwarp-unitsdef.sty \
tex-lwarp-upgreek.sty \
tex-lwarp-upref.sty \
tex-lwarp-url.sty \
tex-lwarp-ushort.sty \
tex-lwarp-uspace.sty \
tex-lwarp-varioref.sty \
tex-lwarp-verse.sty \
tex-lwarp-versonotes.sty \
tex-lwarp-vertbars.sty \
tex-lwarp-vmargin.sty \
tex-lwarp-vowel.sty \
tex-lwarp-vpe.sty \
tex-lwarp-vwcol.sty \
tex-lwarp-wallpaper.sty \
tex-lwarp-watermark.sty \
tex-lwarp-widetable.sty \
tex-lwarp-widows-and-orphans.sty \
tex-lwarp-witharrows.sty \
tex-lwarp-wrapfig.sty \
tex-lwarp-wrapfig2.sty \
tex-lwarp-xbmks.sty \
tex-lwarp-xcolor.sty \
tex-lwarp-xechangebar.sty \
tex-lwarp-xellipsis.sty \
tex-lwarp-xetexko.sty \
tex-lwarp-xevlna.sty \
tex-lwarp-xfakebold.sty \
tex-lwarp-xfrac.sty \
tex-lwarp-xltabular.sty \
tex-lwarp-xltxtra.sty \
tex-lwarp-xmpincl.sty \
tex-lwarp-xpiano.sty \
tex-lwarp-xpinyin.sty \
tex-lwarp-xr-hyper.sty \
tex-lwarp-xr.sty \
tex-lwarp-xtab.sty \
tex-lwarp-xunicode.sty \
tex-lwarp-xurl.sty \
tex-lwarp-xy.sty \
tex-lwarp-zhlineskip.sty \
tex-lwarp-zwpagelayout.sty \
tex-lwarp.sty \
texlive-lwarp"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-array.sty \
tex-backref.sty \
tex-balance.sty \
tex-calc.sty \
tex-capt-of.sty \
tex-cleveref.sty \
tex-comment.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyvrb.sty \
tex-filecontents.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-footnote.sty \
tex-geometry.sty \
tex-gettitlestring.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-ifptex.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-kpfonts-otf.sty \
tex-kpfonts.sty \
tex-kvoptions.sty \
tex-latexsym.sty \
tex-letltxmacro.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-ltablex.sty \
tex-makeidx.sty \
tex-manyfoot.sty \
tex-mdframed.sty \
tex-metalogo.sty \
tex-microtype.sty \
tex-mtcoff.sty \
tex-multicol.sty \
tex-musicography.sty \
tex-nccfoots.sty \
tex-newfloat.sty \
tex-newunicodechar.sty \
tex-parallel.sty \
tex-parcolumns.sty \
tex-pdftexcmds.sty \
tex-perpage.sty \
tex-prelim2e.sty \
tex-printlen.sty \
tex-realscripts.sty \
tex-refcount.sty \
tex-remreset.sty \
tex-rotating.sty \
tex-scrlayer-scrpage.sty \
tex-scrtime.sty \
tex-soul.sty \
tex-soulutf8.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-tagpdf.sty \
tex-textcase.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-typearea.sty \
tex-upquote.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lwarp-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
