SUMMARY = "Binary files of dvidvi"
DESCRIPTION = "Binary files of dvidvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvidvi-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "54395916d903041e5d8995ff41243025cd322031bca54fda6c4f4b930253af5b46ccd268427f42f05a6ef3a2617dec652e8bbb1e90cbf1c81936bc4498419aee"

RPROVIDES:${PN} += "texlive-dvidvi-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-dvidvi"

inherit rpm
