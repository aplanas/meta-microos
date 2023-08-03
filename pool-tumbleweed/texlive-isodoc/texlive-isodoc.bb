SUMMARY = "A LaTeX class for typesetting letters and invoices"
DESCRIPTION = "The isodoc class can be used for the preparation of letters and \
invoices (and, in the future, similar documents). Documents are \
set up with options, thus making the class easily adaptable to \
user's wishes and extensible for other document types. The \
class is based on the NTG brief class by Victor Eijkhout, which \
implements the NEN1026 standard."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn59709"

RPM_NAME = "texlive-isodoc-2023.209.1.14svn59709-56.1.noarch.rpm"
RPM_HASH = "6a16c379597b569d5c388e67f19e26e048620b7f2262761f11aa1bc575ae31cd068bd5602f7aa922921566efb07a6934965a6f8fd2040d899e5e754ea32acb97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isodoc.cls \
texlive-isodoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyhdr.sty \
tex-forarray.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-longtable.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-tabularx.sty \
tex-textpos.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
