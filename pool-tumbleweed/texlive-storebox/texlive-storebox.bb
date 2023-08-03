SUMMARY = "Storing information for reuse"
DESCRIPTION = "The package provides 'store boxes' whose user interface matches \
that of normal LaTeX 'save boxes', except that the content of a \
store box appears at most once in the output PDF file, however \
often it is used. The present version of the package supports \
pdfLaTeX and LuaLaTeX; when DVI is output, store boxes behave \
the same as save boxes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn64967"

RPM_NAME = "texlive-storebox-2023.209.1.3asvn64967-58.1.noarch.rpm"
RPM_HASH = "386541bb41335ed62c7d054288079a66a77c20a63bf795de8acf366b2ea3d1314ea739e14268f2af2e0b1e315d43432fec91b72b355c0ba7ff2a33d2179e7c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-storebox-pgf.sty \
tex-storebox.sty \
texlive-storebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-collectbox.sty \
tex-ifpdf.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
