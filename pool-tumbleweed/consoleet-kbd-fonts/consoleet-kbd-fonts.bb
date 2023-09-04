SUMMARY = "Vector/OTF versions of some classic kbd fonts"
DESCRIPTION = "These are OpenType remakes of (some of) the VGA bitmap fonts otherwise \
found in the 'kbd' package and in /usr/share/kbd/consolefonts/."
LICENSE = "CC-BY-SA-4.0"

PV = "1.3"

RPM_NAME = "consoleet-kbd-fonts-1.3-1.1.noarch.rpm"
RPM_HASH = "3a541d5a30474a78e495ff1b46cd38aac82d1d4f09193a2f59bfb93694572c226bb11940705eb5e6cf642016045d093aa97d0300d593aec785a53877e5d4d905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-kbd-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
