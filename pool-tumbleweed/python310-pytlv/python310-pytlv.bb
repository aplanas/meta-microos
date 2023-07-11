SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python310-pytlv-0.71-1.17.noarch.rpm"
RPM_HASH = "ccdfaff8b527be2ec344da81feda5cf0472534ff37836e0e816914e0caadcdeab8ee35e4f83f6d377978a05060b4c18a02f4edda1a62548f1bcd2b21453f0ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytlv \
python310-pytlv \
python3dist-pytlv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
