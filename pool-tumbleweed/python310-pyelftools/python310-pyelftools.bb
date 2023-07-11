SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "SUSE-Public-Domain"

PV = "0.29"

RPM_NAME = "python310-pyelftools-0.29-1.5.noarch.rpm"
RPM_HASH = "d977d88e580f4049b5370ec87ebc1d313645ce0f8d4b5b99de5aff41e2cfa1120fe770a755410dd22096b3b932ade67da55328014c9a2d8193e7dfaeea4289ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyelftools \
python310-pyelftools \
python3dist-pyelftools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
