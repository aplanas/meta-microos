SUMMARY = "Mangling of various file formats that conveys binary information"
DESCRIPTION = "Mangling of various file formats that conveys binary information (Motorola S-Record, Intel HEX, TI-TXT, Verilog VMEM, ELF and binary files). \
 \
Project homepage: https://github.com/eerimoq/bincopy \
 \
Documentation: https://bincopy.readthedocs.io"
LICENSE = "MIT"

PV = "17.14.5"

RPM_NAME = "python39-bincopy-17.14.5-1.1.noarch.rpm"
RPM_HASH = "cb919349bde1f159804d11dc2ba7efafc5f889623bf92ba54a93a48cfa1f8a520acd0a8d50ebdd1e52a49c0f67fad9f065f3dacf1fa5eefb8d340f677c653a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bincopy \
python39-bincopy \
python3dist-bincopy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
fdupes \
python-abi \
python39-argparse-addons \
python39-humanfriendly \
python39-pyelftools \
update-alternatives"

inherit rpm
