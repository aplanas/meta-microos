SUMMARY = "A bundle of versatile classes and packages"
DESCRIPTION = "The KOMA-Script bundle provides replacements for the article, \
report, and book classes with emphasis on typography and \
versatility. There is also a letter class. The bundle also \
offers: a package for calculating type areas in the way laid \
down by the typographer Jan Tschichold, packages for easily \
changing and defining page styles, a package scrdate for \
getting not only the current date but also the name of the day, \
and a package scrtime for getting the current time. All these \
packages may be used not only with KOMA-Script classes but also \
with the standard classes. Since every package has its own \
version number, the version number quoted only refers to the \
version of scrbook, scrreprt, scrartcl, scrlttr2 and typearea \
(which are the main parts of the bundle)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.38svn64685"

RPM_NAME = "texlive-koma-script-2023.209.3.38svn64685-56.1.noarch.rpm"
RPM_HASH = "39d88fa32823a2d1a5321b97b7f9e3ea1102d16620a6fe7a9e077a5082aa657bfe5acae6595f28dce5c7524bb349d3a709317a5606bc42f6286ad337e023d8cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authorpart-de.tex \
tex-authorpart-en.tex \
tex-common-compatibility-de.tex \
tex-common-compatibility-en.tex \
tex-common-dictum-de.tex \
tex-common-dictum-en.tex \
tex-common-draftmode-de.tex \
tex-common-draftmode-en.tex \
tex-common-fontsize-de.tex \
tex-common-fontsize-en.tex \
tex-common-footnotes-de.tex \
tex-common-footnotes-en.tex \
tex-common-footnotes-experts-de.tex \
tex-common-footnotes-experts-en.tex \
tex-common-headfootheight-de.tex \
tex-common-headfootheight-en.tex \
tex-common-interleafpage-de.tex \
tex-common-interleafpage-en.tex \
tex-common-lists-de.tex \
tex-common-lists-en.tex \
tex-common-marginpar-de.tex \
tex-common-marginpar-en.tex \
tex-common-oddorevenpage-de.tex \
tex-common-oddorevenpage-en.tex \
tex-common-options-de.tex \
tex-common-options-en.tex \
tex-common-pagestylemanipulation-de.tex \
tex-common-pagestylemanipulation-en.tex \
tex-common-parmarkup-de.tex \
tex-common-parmarkup-en.tex \
tex-common-textmarkup-de.tex \
tex-common-textmarkup-en.tex \
tex-common-titles-de.tex \
tex-common-titles-en.tex \
tex-common-typearea-de.tex \
tex-common-typearea-en.tex \
tex-expertpart-de.tex \
tex-expertpart-en.tex \
tex-introduction-de.tex \
tex-introduction-en.tex \
tex-japanlco-en.tex \
tex-koma-script-source-doc.cls \
tex-letter-example-00-de.tex \
tex-letter-example-00-en.tex \
tex-letter-example-01-de.tex \
tex-letter-example-01-en.tex \
tex-letter-example-02-de.tex \
tex-letter-example-02-en.tex \
tex-letter-example-03-de.tex \
tex-letter-example-03-en.tex \
tex-letter-example-04-de.tex \
tex-letter-example-04-en.tex \
tex-letter-example-05-de.tex \
tex-letter-example-05-en.tex \
tex-letter-example-06-de.tex \
tex-letter-example-06-en.tex \
tex-letter-example-07-de.tex \
tex-letter-example-07-en.tex \
tex-letter-example-08-de.tex \
tex-letter-example-08-en.tex \
tex-letter-example-09-de.tex \
tex-letter-example-09-en.tex \
tex-letter-example-10-de.tex \
tex-letter-example-10-en.tex \
tex-letter-example-11-de.tex \
tex-letter-example-11-en.tex \
tex-letter-example-12-de.tex \
tex-letter-example-12-en.tex \
tex-letter-example-13-de.tex \
tex-letter-example-13-en.tex \
tex-letter-example-14-de.tex \
tex-letter-example-14-en.tex \
tex-letter-example-15-de.tex \
tex-letter-example-15-en.tex \
tex-letter-example-16-de.tex \
tex-letter-example-16-en.tex \
tex-letter-example-17-de.tex \
tex-letter-example-17-en.tex \
tex-letter-example-18-de.tex \
tex-letter-example-18-en.tex \
tex-letter-example-19-de.tex \
tex-letter-example-19-en.tex \
tex-letter-example-20-de.tex \
tex-letter-example-20-en.tex \
tex-letter-example-21-de.tex \
tex-letter-example-21-en.tex \
tex-letter-example-22-de.tex \
tex-letter-example-22-en.tex \
tex-letter-example-23-de.tex \
tex-letter-example-23-en.tex \
tex-linkalias.tex \
tex-plength-tikz.tex \
tex-preface-de.tex \
tex-preface-en.tex \
tex-scraddr-de.tex \
tex-scraddr-en.tex \
tex-scraddr.sty \
tex-scrartcl.cls \
tex-scrarticle.cls \
tex-scrbase-de.tex \
tex-scrbase-en.tex \
tex-scrbase.sty \
tex-scrbook.cls \
tex-scrbookreportarticle-de.tex \
tex-scrbookreportarticle-en.tex \
tex-scrbookreportarticle-experts-de.tex \
tex-scrbookreportarticle-experts-en.tex \
tex-scrdate-de.tex \
tex-scrdate-en.tex \
tex-scrdate.sty \
tex-scrdoc.cls \
tex-scrdocstrip.tex \
tex-scrextend-de.tex \
tex-scrextend-en.tex \
tex-scrextend.sty \
tex-scrfontsizes.sty \
tex-scrguide-body.tex \
tex-scrguide-de.tex \
tex-scrguide-en.tex \
tex-scrguide.cls \
tex-scrhack-de.tex \
tex-scrhack-en.tex \
tex-scrhack.sty \
tex-scrjura-de.tex \
tex-scrjura-en.tex \
tex-scrjura-example-de.tex \
tex-scrjura-example-en.tex \
tex-scrjura.sty \
tex-scrkbase.sty \
tex-scrlayer-de.tex \
tex-scrlayer-en.tex \
tex-scrlayer-notecolumn-de.tex \
tex-scrlayer-notecolumn-en.tex \
tex-scrlayer-notecolumn-example-de.tex \
tex-scrlayer-notecolumn-example-en.tex \
tex-scrlayer-notecolumn.sty \
tex-scrlayer-scrpage-de.tex \
tex-scrlayer-scrpage-en.tex \
tex-scrlayer-scrpage-experts-de.tex \
tex-scrlayer-scrpage-experts-en.tex \
tex-scrlayer-scrpage.sty \
tex-scrlayer.sty \
tex-scrletter.cls \
tex-scrletter.sty \
tex-scrlfile-de.tex \
tex-scrlfile-en.tex \
tex-scrlfile-hook-3.34.sty \
tex-scrlfile-hook.sty \
tex-scrlfile-patcholdlatex.sty \
tex-scrlfile.sty \
tex-scrlogo-de.tex \
tex-scrlogo-en.tex \
tex-scrlogo.sty \
tex-scrlttr2-de.tex \
tex-scrlttr2-en.tex \
tex-scrlttr2-experts-de.tex \
tex-scrlttr2-experts-en.tex \
tex-scrlttr2.cls \
tex-scrreport.cls \
tex-scrreprt.cls \
tex-scrsize10pt.clo \
tex-scrsize11pt.clo \
tex-scrsize12pt.clo \
tex-scrtime-de.tex \
tex-scrtime-en.tex \
tex-scrtime.sty \
tex-scrwfile-de.tex \
tex-scrwfile-en.tex \
tex-scrwfile.sty \
tex-terms-de.tex \
tex-terms-en.tex \
tex-tocbasic-de.tex \
tex-tocbasic-en.tex \
tex-tocbasic.sty \
tex-typearea-de.tex \
tex-typearea-en.tex \
tex-typearea-experts-de.tex \
tex-typearea-experts-en.tex \
tex-typearea.sty \
tex-variables-tikz.tex \
texlive-koma-script"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-auxhook.sty \
tex-babelbib.sty \
tex-biblatex.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-keyval.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-makeidx.sty \
tex-marginnote.sty \
tex-mparhack.sty \
tex-multicol.sty \
tex-picture.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-footmisc \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
