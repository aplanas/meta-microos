SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python39-pytlv-0.71-1.17.noarch.rpm"
RPM_HASH = "c4d7af3a50ed597a424660273f2459c0aa2bdd2a2776b1788c5175f7019a02cbb3973015a92f9f0924bd49faefbe9a351afc6c80f73f9efb6f5333d008555b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytlv \
python39-pytlv \
python3dist-pytlv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
