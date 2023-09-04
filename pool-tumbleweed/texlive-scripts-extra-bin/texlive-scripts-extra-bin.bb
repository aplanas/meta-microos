SUMMARY = "Binary files of texlive-scripts-extra"
DESCRIPTION = "Binary files of texlive-scripts-extra"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53577"

RPM_NAME = "texlive-scripts-extra-bin-2023.20230311.svn53577-93.2.aarch64.rpm"
RPM_HASH = "90e0b74516278e969ced7fc43393882b21c4ea42432c34a9b9f9d9a72b974aaab18b1c04c9d1a6c2be11e61a31a14fb2a51fc46937783709838fa56cbf369828"

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
