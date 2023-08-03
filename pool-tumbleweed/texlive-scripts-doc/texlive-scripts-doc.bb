SUMMARY = "Documentation for texlive-scripts"
DESCRIPTION = "This package includes the documentation for texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66584"

RPM_NAME = "texlive-scripts-doc-2023.209.svn66584-55.1.noarch.rpm"
RPM_HASH = "48cfed2177787074cb9c5e517d6b7a144514bcb225ddc80a264ea4e3288cddede7942b9443df3e1d0abff3d1a80ca58bbe2e27bdb88e317854dc3ff11d581e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-fmtutil-sys.1 \
man-fmtutil-user.1 \
man-fmtutil.1 \
man-install-tl.1 \
man-mktexfmt.1 \
man-mktexmf.1 \
man-mktexpk.1 \
man-mktextfm.1 \
man-texhash.1 \
man-updmap-sys.1 \
man-updmap-user.1 \
man-updmap.1 \
texlive-scripts-doc \
texlive-tetex-doc-/usr/share/man/man1/fmtutil-sys.1.gz \
texlive-tetex-doc-/usr/share/man/man1/fmtutil-user.1.gz \
texlive-tetex-doc-/usr/share/man/man1/fmtutil.1.gz \
texlive-tetex-doc-/usr/share/man/man1/updmap-sys.1.gz \
texlive-tetex-doc-/usr/share/man/man1/updmap-user.1.gz \
texlive-tetex-doc-/usr/share/man/man1/updmap.1.gz \
texlive-tetex-doc-/usr/share/man/man5/fmtutil.cnf.5.gz \
texlive-tetex-doc-/usr/share/man/man5/updmap.cfg.5.gz \
texlive-texconfig-doc-/usr/share/man/man1/texconfig-sys.1.gz \
texlive-texconfig-doc-/usr/share/man/man1/texconfig.1.gz"

RDEPENDS:${PN} += ""

inherit rpm
