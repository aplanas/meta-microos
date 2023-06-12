SUMMARY = "Binary files of pst-pdf"
DESCRIPTION = "Binary files of pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn7838"

RPM_NAME = "texlive-pst-pdf-bin-2023.20230311.svn7838-91.1.aarch64.rpm"
RPM_HASH = "881115e1c57dd40d14e943ab8dff39ea8219c49618443372690aefe99d6d5e71a0ef98e533d2b68aea55692c0796c41d732f642a52d045d52033a43ddd2f16a4"

RPROVIDES:${PN} += "texlive-pst-pdf-bin \
texlive-pst-pdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pst-pdf"

inherit rpm
