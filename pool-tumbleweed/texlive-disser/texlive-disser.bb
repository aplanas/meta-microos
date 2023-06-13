SUMMARY = "Class and templates for typesetting dissertations in Russian"
DESCRIPTION = "Disser comprises a document class and set of templates for \
typesetting dissertations in Russian. One of its primary \
advantages is a simplicity of format specification for \
titlepage, headers and elements of automatically generated \
lists (table of contents, list of figures, etc). Bibliography \
styles, that conform to the requirements of the Russian \
standard GOST R 7.0.11-2011, are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn43417"

RPM_NAME = "texlive-disser-2023.201.1.5.0svn43417-52.1.noarch.rpm"
RPM_HASH = "7d12b77e1c3bc7446d85eefd0a9481dada38da5044cf12e93778e66b2988f033d35a0e857fc87ca937847365fe58fcb11ad9d320f11f938418f20aa02f484ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(autoref.rtx) \
tex(bachelor.rtx) \
tex(candidate.rtx) \
tex(disser.cls) \
tex(doctor.rtx) \
tex(gost732.cls) \
tex(master.rtx) \
tex(specialist.rtx) \
tex(titledefs.rtx) \
texlive-disser"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(caption.sty) \
tex(cmap.sty) \
tex(color.sty) \
tex(exscale.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(kvoptions.sty) \
tex(natbib.sty) \
tex(subcaption.sty) \
tex(textcase.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
