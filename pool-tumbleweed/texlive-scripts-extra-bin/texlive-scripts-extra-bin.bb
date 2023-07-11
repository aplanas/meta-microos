SUMMARY = "Binary files of texlive-scripts-extra"
DESCRIPTION = "Binary files of texlive-scripts-extra"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53577"

RPM_NAME = "texlive-scripts-extra-bin-2023.20230311.svn53577-92.1.aarch64.rpm"
RPM_HASH = "e758b1dc2d42476eb23130f023f3ed7c0a295221c38727d2f0717160b34782c94072ea8b6604d18e21fc3c8f858cfd8cfaeadefeb6367ef59276f7a855199417"

RPROVIDES:${PN} += "texlive-pdftools-bin-/usr/bin/e2pall \
texlive-scripts-extra-bin \
texlive-tetex-bin-/usr/bin/allcm \
texlive-tetex-bin-/usr/bin/allneeded \
texlive-tetex-bin-/usr/bin/dvi2fax \
texlive-tetex-bin-/usr/bin/dvired \
texlive-tetex-bin-/usr/bin/kpsetool \
texlive-tetex-bin-/usr/bin/kpsewhere \
texlive-tetex-bin-/usr/bin/texconfig-dialog \
texlive-tetex-bin-/usr/bin/texconfig-sys \
texlive-tetex-bin-/usr/bin/texlinks \
texlive-texconfig-bin-/usr/bin/texconfig"

RDEPENDS:${PN} += "/usr/bin/sh \
texlive-scripts-extra"

inherit rpm
