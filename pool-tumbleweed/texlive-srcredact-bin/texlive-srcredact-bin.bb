SUMMARY = "Binary files of srcredact"
DESCRIPTION = "Binary files of srcredact"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38710"

RPM_NAME = "texlive-srcredact-bin-2023.20230311.svn38710-91.1.aarch64.rpm"
RPM_HASH = "369f6e5dfbef47a25e8ccd9a4ef5656566f2d12a3bd5da2ee12a48e5b1be750d8d08b171f26a67e8acf23317774ecfed919fd6eb9a49c5ae2f7cc78f9a3009f9"

RPROVIDES:${PN} += "texlive-srcredact-bin \
texlive-srcredact-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-srcredact"

inherit rpm
