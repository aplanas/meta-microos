SUMMARY = "Non-variable M PLUS Code Latin 60 font"
DESCRIPTION = "A monospaced font with 7 weights from Thin to Bold. \
M PLUS Code Latin 50 has a 50% character width."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus-code-latin50-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "8c7973ed3a4ab60d5901ec2ace676e18a54f8ad30c44a0c65a809baf118a49e0d1a7dbd90eeded3f12b5fe04dafd53266471f01d99fe165dce367c5589ed07c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-code-latin50-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
