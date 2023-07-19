SUMMARY = "Binary files of ptex2pdf"
DESCRIPTION = "Binary files of ptex2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29335"

RPM_NAME = "texlive-ptex2pdf-bin-2023.20230311.svn29335-93.1.aarch64.rpm"
RPM_HASH = "f3954a6b027d4a59b244b53b7f0e3268873fe48bfb680b01dedbd4a2c9639002b2600be6745092302301d783cead077ed74a4c0a4924416d8419fc5faad18a1d"

RPROVIDES:${PN} += "texlive-ptex2pdf-bin"

RDEPENDS:${PN} += "texlive-ptex2pdf"

inherit rpm
