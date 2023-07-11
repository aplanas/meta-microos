SUMMARY = "Binary files of ctanify"
DESCRIPTION = "Binary files of ctanify"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24061"

RPM_NAME = "texlive-ctanify-bin-2023.20230311.svn24061-92.1.aarch64.rpm"
RPM_HASH = "a8d53bb1490a5c4d0681ab1c7d4911ddf2f35be6ce2d2bc9ba28f9ad368f698b5886e08b558e6bce5dff09f1a224862fd39fa05bcbf4d49b7e1cb0c0cbdc9188"

RPROVIDES:${PN} += "texlive-ctanify-bin"

RDEPENDS:${PN} += "texlive-ctanify"

inherit rpm
