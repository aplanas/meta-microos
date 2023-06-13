SUMMARY = "Development pre-release of the LaTeX tools bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX tools \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2023.201.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-tools-dev-2023.201.20230501_pre_release_0svn64899-55.1.noarch.rpm"
RPM_HASH = "540c9d01d1cf19f50e2f654496b1e84c47101afd2b5ccfa23ad8bd9a6fe1416842fa44843d41ae6d0982219284fc289ac97f7f455e90910a7725a604a5900286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev(afterpage.sty) \
texdev(array-2016-10-06.sty) \
texdev(array-2020-02-10.sty) \
texdev(array.sty) \
texdev(bm.sty) \
texdev(calc.sty) \
texdev(dcolumn.sty) \
texdev(delarray.sty) \
texdev(e.tex) \
texdev(enumerate.sty) \
texdev(fontsmpl.sty) \
texdev(fontsmpl.tex) \
texdev(ftnright.sty) \
texdev(h.tex) \
texdev(hhline.sty) \
texdev(indentfirst.sty) \
texdev(layout.sty) \
texdev(longtable-2020-01-07.sty) \
texdev(longtable.sty) \
texdev(multicol-2017-04-11.sty) \
texdev(multicol-2019-10-01.sty) \
texdev(multicol.sty) \
texdev(q.tex) \
texdev(r.tex) \
texdev(rawfonts.sty) \
texdev(s.tex) \
texdev(shellesc.sty) \
texdev(showkeys-2014-10-28.sty) \
texdev(showkeys.sty) \
texdev(somedefs.sty) \
texdev(tabularx.sty) \
texdev(thb.sty) \
texdev(thc.sty) \
texdev(thcb.sty) \
texdev(theorem.sty) \
texdev(thm.sty) \
texdev(thmb.sty) \
texdev(thp.sty) \
texdev(trace.sty) \
texdev(varioref-2016-02-16.sty) \
texdev(varioref.sty) \
texdev(verbatim.sty) \
texdev(verbtest.tex) \
texdev(x.tex) \
texdev(xr.sty) \
texdev(xspace.sty) \
texlive-latex-tools-dev"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texdev(color.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
