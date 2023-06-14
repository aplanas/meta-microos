SUMMARY = "An extended general-purpose class"
DESCRIPTION = "The ncc class provides a framework for a common class to \
replace the standard article, book and report classes, and \
providing a 'preprint' class. The class's extensions are \
provided in a number of small packages, some of which may also \
be used with the standard classes. The ncclatex package also \
loads many of the packages of, and requires the latest version \
of the ncctools bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-ncclatex-2023.201.1.5svn15878-54.1.noarch.rpm"
RPM_HASH = "93911b9de1b23abe68aa5b4c9de3d9845d5a40b4f4f46167e5945dc76cb1d27105e541732ece8cb3033ae927011abb8a1e8a685635ebf3c88a6f71a49f268224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cp1251-light.def \
tex-ncc.cls \
tex-ncc10.clo \
tex-ncc11.clo \
tex-ncc12.clo \
tex-ncc14.clo \
tex-nccart.clo \
tex-nccbiblist.sty \
tex-nccbook.clo \
tex-nccdefaults.sty \
tex-nccfit.clo \
tex-ncchdr.sty \
tex-nccheadings.sty \
tex-nccindex.sty \
tex-ncclatex.sty \
tex-nccltrus.sty \
tex-nccold.sty \
tex-nccproc.cls \
tex-nccsections.sty \
tex-ncctheorems.sty \
tex-ncctitle.clo \
tex-ncctitle.sty \
tex-ncctitlepage.sty \
tex-sibjnm.cls \
texlive-ncclatex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpackage.sty \
tex-amstext.sty \
tex-babel.sty \
tex-cp1251.def \
tex-dcounter.sty \
tex-desclist.sty \
tex-extdash.sty \
tex-fontenc.sty \
tex-inputenc.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-nccboxes.sty \
tex-nccfancyhdr.sty \
tex-nccfloats.sty \
tex-nccfoots.sty \
tex-nccmath.sty \
tex-nccpic.sty \
tex-nccsect.sty \
tex-nccthm.sty \
tex-textarea.sty \
tex-tocenter.sty \
tex-topsection.sty \
tex-watermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
