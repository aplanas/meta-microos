SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.1"

RPM_NAME = "python39-diskcache-5.6.1-1.1.noarch.rpm"
RPM_HASH = "0d7318f239a38a6c92832b7b44977fbcd3c4e3c71e29b9e1d3a334a72e2cedf5b4dd4b585dd16ae50417d159c82b0adbd3f973bf092c8544fa015bed5784c43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(diskcache) \
python39-diskcache \
python3dist(diskcache)"

RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm
