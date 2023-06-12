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

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-2023.201.1.1asvn15878-53.1.noarch.rpm"
RPM_HASH = "facf3d7e239b362febfc81f8dde89e3f7040fdf687dc9f02b92c19c71701d391ae91184fefd738afe219c25e3848784c985149834df3ffc4f9a7806a2759daa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dcwrtbib.sty) \
tex(dvdcoll.cls) \
tex(pdfnotiz.sty) \
texlive-dvdcoll"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(afterpage.sty) \
tex(array.sty) \
tex(booktabs.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(marginnote.sty) \
tex(multicol.sty) \
tex(ragged2e.sty) \
tex(scrreprt.cls) \
tex(tabularx.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
