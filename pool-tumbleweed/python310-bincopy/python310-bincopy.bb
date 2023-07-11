SUMMARY = "Mangling of various file formats that conveys binary information"
DESCRIPTION = "Mangling of various file formats that conveys binary information (Motorola S-Record, Intel HEX, TI-TXT, Verilog VMEM, ELF and binary files). \
 \
Project homepage: https://github.com/eerimoq/bincopy \
 \
Documentation: https://bincopy.readthedocs.io"
LICENSE = "MIT"

PV = "17.14.5"

RPM_NAME = "python310-bincopy-17.14.5-1.1.noarch.rpm"
RPM_HASH = "7025ef7ad05551f186361b8b6078b825a716b2071d3d6145a163364e6f66f0bddc64b5f273c9010fe72e78d0df5a18fcd3ad8cc0603368a5bbfbc7fbd5b3f666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bincopy \
python310-bincopy \
python3dist-bincopy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
fdupes \
python-abi \
python310-argparse-addons \
python310-humanfriendly \
python310-pyelftools \
update-alternatives"

inherit rpm
