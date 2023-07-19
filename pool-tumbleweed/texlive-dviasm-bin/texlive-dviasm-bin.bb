SUMMARY = "Binary files of dviasm"
DESCRIPTION = "Binary files of dviasm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8329"

RPM_NAME = "texlive-dviasm-bin-2023.20230311.svn8329-93.1.aarch64.rpm"
RPM_HASH = "8bb60574e7a035969445b9bd5371227a9e6f2bef4c5030f9510b2f6bd9deb999f9ad38c7f23511084d5088fddc9b21127f7864fe9b012b8d391050c2b7b702f6"

RPROVIDES:${PN} += "texlive-dviasm-bin"

RDEPENDS:${PN} += "texlive-dviasm"

inherit rpm
