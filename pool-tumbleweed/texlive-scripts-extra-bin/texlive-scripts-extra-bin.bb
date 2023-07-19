SUMMARY = "Binary files of texlive-scripts-extra"
DESCRIPTION = "Binary files of texlive-scripts-extra"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53577"

RPM_NAME = "texlive-scripts-extra-bin-2023.20230311.svn53577-93.1.aarch64.rpm"
RPM_HASH = "ddf64b0d980f8f10be0db17343dee001383f74e73feec53963e55a99f428bc85d396d333aaa704e983ee9bc2abab17c3581824a872c7e4272abfb8433f4038a8"

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
