SUMMARY = "Mangling of various file formats that conveys binary information"
DESCRIPTION = "Mangling of various file formats that conveys binary information (Motorola S-Record, Intel HEX, TI-TXT, Verilog VMEM, ELF and binary files). \
 \
Project homepage: https://github.com/eerimoq/bincopy \
 \
Documentation: https://bincopy.readthedocs.io"
LICENSE = "MIT"

PV = "17.14.5"

RPM_NAME = "python311-bincopy-17.14.5-1.1.noarch.rpm"
RPM_HASH = "f8d35a011d5cd57c9a38c246b7953e8351a7e14775fed8ec4a928547da8428b357cc8616af2228c3d55d592a7ac14ca2e1da9ee9275a4704431643371d7c77a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bincopy \
python3.11dist-bincopy \
python311-bincopy \
python3dist-bincopy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
fdupes \
python-abi \
python311-argparse-addons \
python311-humanfriendly \
python311-pyelftools \
update-alternatives"

inherit rpm
