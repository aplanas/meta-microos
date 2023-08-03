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

PV = "2023.209.3.5.3svn51810"

RPM_NAME = "texlive-ncctools-2023.209.3.5.3svn51810-55.1.noarch.rpm"
RPM_HASH = "8860799a2eef1635d99e3c3760a58733a42abd7c693ea6e95cd27cfa0164bb3db0c2e9bc7868de0d81908c5780e8a27e6fde0e8ca14d476c133c1e118c25fb3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afterpackage.sty \
tex-dcounter.sty \
tex-desclist.sty \
tex-extdash.sty \
tex-manyfoot.sty \
tex-mboxfill.sty \
tex-nccbbb.sty \
tex-nccboxes.sty \
tex-ncccomma.sty \
tex-ncccropbox.sty \
tex-ncccropmark.sty \
tex-nccfancyhdr.sty \
tex-nccfloats.sty \
tex-nccfoots.sty \
tex-nccmath.sty \
tex-nccparskip.sty \
tex-nccpic.sty \
tex-nccrules.sty \
tex-nccsect.sty \
tex-nccstretch.sty \
tex-nccthm.sty \
tex-textarea.sty \
tex-tocenter.sty \
tex-topsection.sty \
tex-watermark.sty \
texlive-ncctools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsgen.sty \
tex-amsmath.sty \
tex-graphicx.sty \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
