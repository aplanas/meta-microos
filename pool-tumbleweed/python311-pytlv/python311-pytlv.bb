SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python311-pytlv-0.71-1.16.noarch.rpm"
RPM_HASH = "888f283259f41d41c36a601d8851534e75c6ef6a53bcd7a645ce1f4929663d2d9e37571e23f3650cf3178c236743681cb7bfc07eeafbdcf8b7f9b2e9332b5892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytlv \
python311-pytlv \
python3dist-pytlv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
