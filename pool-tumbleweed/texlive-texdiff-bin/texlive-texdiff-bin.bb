SUMMARY = "Binary files of texdiff"
DESCRIPTION = "Binary files of texdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15506"

RPM_NAME = "texlive-texdiff-bin-2023.20230311.svn15506-92.1.aarch64.rpm"
RPM_HASH = "6501fbbfb7bee5ad53930ddadc38208b3867da283a8ca9a86a2330c9e183bc026fd635f60540c70717796e5a6529aeaa1bc127a7680b43cbd629150e5d1add12"

RPROVIDES:${PN} += "texlive-texdiff-bin"

RDEPENDS:${PN} += "texlive-texdiff"

inherit rpm
