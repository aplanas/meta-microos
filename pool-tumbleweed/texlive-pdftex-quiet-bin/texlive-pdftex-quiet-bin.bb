SUMMARY = "Binary files of pdftex-quiet"
DESCRIPTION = "Binary files of pdftex-quiet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49140"

RPM_NAME = "texlive-pdftex-quiet-bin-2023.20230311.svn49140-91.1.aarch64.rpm"
RPM_HASH = "fa0309dfbe90bd44bf8fa2760f8598e4dfb42831166c729ce1c4a036ab5648a41fe0668da0c450dafe8d2b0b9c10bcc294fa464ef772cd2b285ed8c4e84c3f7b"

RPROVIDES:${PN} += "texlive-pdftex-quiet-bin \
texlive-pdftex-quiet-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-pdftex-quiet"

inherit rpm
