SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.1"

RPM_NAME = "python311-diskcache-5.6.1-1.1.noarch.rpm"
RPM_HASH = "5a28c745243e10ad6c0c7ac62e5ec288501413a0164af7b9a8712531180ab41a5dd97905d37207639f28b66869d8eddd0283ec19675f57bc1ebf2366fc12d1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(diskcache) \
python311-diskcache \
python3dist(diskcache)"
RDEPENDS:${PN} += "python(abi) \
python311"

inherit rpm
