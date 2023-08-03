SUMMARY = "Documentation for texlive-dynblocks"
DESCRIPTION = "This package includes the documentation for texlive-dynblocks"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-doc-2023.209.0.0.2bsvn35193-54.1.noarch.rpm"
RPM_HASH = "8302577102f730dfe2d1557b3587cf8c80406ae54c618853ee2e666b461539ac3468330cf0310a268f60e1b301bfc8dff1c91a758da24f0dae58e855e5a799d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
