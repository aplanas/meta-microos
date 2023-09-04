SUMMARY = "Binary files of perltex"
DESCRIPTION = "Binary files of perltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16181"

RPM_NAME = "texlive-perltex-bin-2023.20230311.svn16181-93.2.aarch64.rpm"
RPM_HASH = "4117cd202a18d77c390cae24d1970a6a19b3e16f1a685ec8b10bafb6840958dbdbaa5e86b9e4e578ae70a79ba3308a4dcb64ebd96b5762afa61084187dd762d3"

RPROVIDES:${PN} += "texlive-perltex-bin"

RDEPENDS:${PN} += "texlive-perltex"

inherit rpm
