SUMMARY = "Binary files of lollipop"
DESCRIPTION = "Binary files of lollipop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41465"

RPM_NAME = "texlive-lollipop-bin-2023.20230311.svn41465-93.2.aarch64.rpm"
RPM_HASH = "54f82c23ab50367cc38064185aedac0f7f34229ef50c3b95e2b7653931720b96a04d5d091c176982c8c49ae837a5f27ba678b875a2d81f5ea0b6c7d49f20196d"

RPROVIDES:${PN} += "texlive-lollipop-bin"

RDEPENDS:${PN} += "texlive-lollipop"

inherit rpm
