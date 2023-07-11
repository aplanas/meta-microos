SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "SUSE-Public-Domain"

PV = "0.29"

RPM_NAME = "python39-pyelftools-0.29-1.5.noarch.rpm"
RPM_HASH = "2e55ee94a8edc171a8737a15991290b5917499fc4a2acc23c09cbf66fc385f37506922ea490aefbb0a07517a3d8161ccf03d1a96df43ea6036ff4d735d9f98b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyelftools \
python39-pyelftools \
python3dist-pyelftools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
