SUMMARY = "Documentation for texlive-scripts-extra"
DESCRIPTION = "This package includes the documentation for texlive-scripts-extra"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62517"

RPM_NAME = "texlive-scripts-extra-doc-2023.209.svn62517-55.1.noarch.rpm"
RPM_HASH = "ec514b948f381307bcd92dbbf42039b003e8f5dae5c5fa6f59d0344516aa8ed1f3c18f80d0d1040830c35ca11ed15b131f332bc1e732b73c8b5ba1eb4bf30941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-allcm.1 \
man-allec.1 \
man-allneeded.1 \
man-dvi2fax.1 \
man-dvired.1 \
man-e2pall.1 \
man-kpsepath.1 \
man-kpsetool.1 \
man-kpsewhere.1 \
man-kpsexpand.1 \
man-mkocp.1 \
man-mkofm.1 \
man-ps2frag.1 \
man-pslatex.1 \
man-texconfig-sys.1 \
man-texconfig.1 \
man-texlinks.1 \
texlive-pdftools-doc-/usr/share/man/man1/e2pall.1.gz \
texlive-pstools-doc-/usr/share/man/man1/ps2frag.1.gz \
texlive-pstools-doc-/usr/share/man/man1/pslatex.1.gz \
texlive-scripts-extra-doc \
texlive-tetex-doc-/usr/share/man/man1/allcm.1.gz \
texlive-tetex-doc-/usr/share/man/man1/allec.1.gz \
texlive-tetex-doc-/usr/share/man/man1/allneeded.1.gz \
texlive-tetex-doc-/usr/share/man/man1/dvi2fax.1.gz \
texlive-tetex-doc-/usr/share/man/man1/dvired.1.gz \
texlive-tetex-doc-/usr/share/man/man1/kpsepath.1.gz \
texlive-tetex-doc-/usr/share/man/man1/kpsetool.1.gz \
texlive-tetex-doc-/usr/share/man/man1/kpsewhere.1.gz \
texlive-tetex-doc-/usr/share/man/man1/kpsexpand.1.gz \
texlive-tetex-doc-/usr/share/man/man1/texlinks.1.gz"

RDEPENDS:${PN} += ""

inherit rpm
