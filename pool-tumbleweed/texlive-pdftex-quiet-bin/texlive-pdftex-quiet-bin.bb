SUMMARY = "Binary files of pdftex-quiet"
DESCRIPTION = "Binary files of pdftex-quiet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49140"

RPM_NAME = "texlive-pdftex-quiet-bin-2023.20230311.svn49140-93.1.aarch64.rpm"
RPM_HASH = "e4c8837e92930700eedb4e5ee6de1f3a7cd23e167f1bfcfe5347b2ff9843161d1ede6d2f8cf749b3870300c3c6e37cff106d403f2230113a082f7b1c59040040"

RPROVIDES:${PN} += "texlive-pdftex-quiet-bin"

RDEPENDS:${PN} += "texlive-pdftex-quiet"

inherit rpm
