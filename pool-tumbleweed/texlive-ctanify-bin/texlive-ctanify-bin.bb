SUMMARY = "Binary files of ctanify"
DESCRIPTION = "Binary files of ctanify"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24061"

RPM_NAME = "texlive-ctanify-bin-2023.20230311.svn24061-91.1.aarch64.rpm"
RPM_HASH = "c1fa4edd03bf2dc5f64703341799571f7d8d7fa6711aea4699aba7cd5765ccf4ce4caa19124cca2d81e76dba2a0f08a43e4796a966fb7cc8a6e10957425cec91"

RPROVIDES:${PN} += "texlive-ctanify-bin"

RDEPENDS:${PN} += "texlive-ctanify"

inherit rpm
