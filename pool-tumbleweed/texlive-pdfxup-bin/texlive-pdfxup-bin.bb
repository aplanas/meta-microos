SUMMARY = "Binary files of pdfxup"
DESCRIPTION = "Binary files of pdfxup"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn40690"

RPM_NAME = "texlive-pdfxup-bin-2023.20230311.svn40690-92.1.aarch64.rpm"
RPM_HASH = "6f47ac689606de69f71604d8c9ef2b37538bfb39b214c2feae8034032e583e98399d54ca3deefc85b577c814150b893a21f93c0c2c6b19494953ff9c089e6089"

RPROVIDES:${PN} += "texlive-pdfxup-bin"

RDEPENDS:${PN} += "texlive-pdfxup"

inherit rpm
