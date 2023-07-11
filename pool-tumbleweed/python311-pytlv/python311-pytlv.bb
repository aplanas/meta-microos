SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python311-pytlv-0.71-1.17.noarch.rpm"
RPM_HASH = "f4a6f678435340397d2da2424bfa7014d810bdbd25e01126c4c2dd86629ba08014fdcfca7e4c5d81a9f121cb218425ce73e5617886a150ba6e014695ba7f8782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytlv \
python3.11dist-pytlv \
python311-pytlv \
python3dist-pytlv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
