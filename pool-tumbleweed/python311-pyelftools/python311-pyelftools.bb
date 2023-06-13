SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "SUSE-Public-Domain"

PV = "0.29"

RPM_NAME = "python311-pyelftools-0.29-1.4.noarch.rpm"
RPM_HASH = "12e9baaa1f44417d1848f9863e0e7255a5c5efbcac65552f5693939e2712c986b5e0dbd653839e3d491eed4fea072ccde57a2c15e5655e5d8c21be3d7e4e4279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyelftools) \
python311-pyelftools \
python3dist(pyelftools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
