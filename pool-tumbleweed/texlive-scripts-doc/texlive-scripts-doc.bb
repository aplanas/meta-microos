SUMMARY = "Documentation for texlive-scripts"
DESCRIPTION = "This package includes the documentation for texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66584"

RPM_NAME = "texlive-scripts-doc-2023.201.svn66584-54.1.noarch.rpm"
RPM_HASH = "4f28edb88b1befb0da29dfa5b3a3230d998424e492f0c560ec17ef1e8943cd9d8be9bc3988d07ad0f253b0d04283888a553bfe1a8b4238256c1b54a5a08e1484"
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
