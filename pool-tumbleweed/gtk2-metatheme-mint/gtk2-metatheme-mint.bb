SUMMARY = "Mint Themes -- GTK+ 2 Support"
DESCRIPTION = "A collection of Mint GTK+ themes."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "gtk2-metatheme-mint-2.0.8-1.1.noarch.rpm"
RPM_HASH = "60fbd50efcb2fd962c5f11e241f6bb0fc84221751ae53419949972a5f6236b5ae78f0247b78499a12ec2dde161623a3418f03277dd9b08a03be54e71f427c6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-mint"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-mint-common"

inherit rpm
