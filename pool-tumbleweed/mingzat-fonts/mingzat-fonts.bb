SUMMARY = "Lepcha Font"
DESCRIPTION = "Mingzat is a Unicode font based on Jason Glavy's JG Lepcha custom-encoded font."
LICENSE = "OFL-1.1"

PV = "1.100"

RPM_NAME = "mingzat-fonts-1.100-1.2.noarch.rpm"
RPM_HASH = "f8621ebede5f894fed51456da935e791f0913e8325ea83196008832988e43965f7d7fdae25392c415b624a05b9b1de8e4baf2546e467f802f04d576d56f261be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingzat-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
