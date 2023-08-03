SUMMARY = "A class for typesetting DVD archives"
DESCRIPTION = "Having lost the overview of my DVD archives, I simply could not \
remember if I already recorded the documentary running on TV \
that day. I chose to recreate the index using LaTeX: the design \
aim was a hyperlinked and fully searchable PDF-document, \
listing my DVDs with all titles, lengths and so on. Further \
requirements were support for seasons of tv series and a list \
with all faulty or missing programs for rerecording. The \
dvdcoll class supports all these requirements. dvdcoll.cls \
follows the structure <number><title><length>. As a result, the \
class is not limited to DVDs--you can of course typeset \
archives of CD-ROMs, Audio-CDs and so on. Supported languages \
at the moment: English, French, German, Italian, Polish, \
Portuguese, Spanish. Some help is needed for other languages!"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-2023.209.1.1asvn15878-54.1.noarch.rpm"
RPM_HASH = "0326148c6a5a03429205f29722058c215f73ea3cb8a053b536f8bf0c26e5a28c891e35156b4b9aecdb897187e496519d0ca2efc2849a8e32d81e2a98431295fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dcwrtbib.sty \
tex-dvdcoll.cls \
tex-pdfnotiz.sty \
texlive-dvdcoll"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-array.sty \
tex-booktabs.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-marginnote.sty \
tex-multicol.sty \
tex-ragged2e.sty \
tex-scrreprt.cls \
tex-tabularx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
