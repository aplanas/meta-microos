SUMMARY = "Placeholders for unfinished documents"
DESCRIPTION = "This package lets you produce placeholder elements for \
documents under development, similar to the skeleton screens \
used while loading contents in many applications and websites. \
It also has a mechanism for attaching explanatory endnotes to \
these placeholders, or to anything else in your document. The \
same note mechanism can also be used with ordinary content, \
e.g., as a to-do mechanism."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn57922"

RPM_NAME = "texlive-skeldoc-2023.209.0.0.1.2svn57922-58.1.noarch.rpm"
RPM_HASH = "d197fdfe2f01b1bc8ab4c952672838a5128815b954dddf5fcc051e20369ed83b66a99bd0e80a2f46f10feb8c0c98394eb0eedb5783849206ba083be9942d040a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skeldoc.sty \
texlive-skeldoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-enotez.sty \
tex-enumitem.sty \
tex-expl3.sty \
tex-hyperref.sty \
tex-marginnote.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
