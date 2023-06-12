SUMMARY = "A collection of general packages for LaTeX"
DESCRIPTION = "The NCCtools bundle contains many packages for general use \
under LaTeX; many are also used by NCC LaTeX. The bundle \
includes tools for: executing commands after a package is \
loaded; watermarks; counter manipulation (dynamic counters, \
changing counter numbering with another counter); improvements \
to the description environment; hyphenation of compound words; \
new levels of footnotes; space-filling patterns; 'poor man's' \
Black Board Bold symbols; alignment of the content of a box; \
use comma as decimal separator; boxes with their own crop \
marks; page cropmarks; improvements to fancy headers; float \
'styles', mini floats, side floats; manually marked footnotes; \
extension of amsmath; control of paragraph skip; an envelope to \
the graphicx package; dashed and multiple rules; alternative \
techniques for declarations of sections, captions, and \
toc-entries; generalised text-stretching; generation of new \
theorem-like environments; control of the text area; centred \
page layouts; and un-numbered top-level section."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5.3svn51810"

RPM_NAME = "texlive-ncctools-2023.201.3.5.3svn51810-54.1.noarch.rpm"
RPM_HASH = "921a2a3e4920ba69604f37ff83ef2697125e7a47e7f7cd15920b68596c67b7a9dd6574a937898c152e8d71181a4db3f1554ab7701a386dbaed10af91309c9ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(afterpackage.sty) \
tex(dcounter.sty) \
tex(desclist.sty) \
tex(extdash.sty) \
tex(manyfoot.sty) \
tex(mboxfill.sty) \
tex(nccbbb.sty) \
tex(nccboxes.sty) \
tex(ncccomma.sty) \
tex(ncccropbox.sty) \
tex(ncccropmark.sty) \
tex(nccfancyhdr.sty) \
tex(nccfloats.sty) \
tex(nccfoots.sty) \
tex(nccmath.sty) \
tex(nccparskip.sty) \
tex(nccpic.sty) \
tex(nccrules.sty) \
tex(nccsect.sty) \
tex(nccstretch.sty) \
tex(nccthm.sty) \
tex(textarea.sty) \
tex(tocenter.sty) \
tex(topsection.sty) \
tex(watermark.sty) \
texlive-ncctools"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsgen.sty) \
tex(amsmath.sty) \
tex(graphicx.sty) \
tex(perpage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
