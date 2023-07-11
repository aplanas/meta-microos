SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.1"

RPM_NAME = "python310-diskcache-5.6.1-1.3.noarch.rpm"
RPM_HASH = "8b3ae2e074fd48e52dfbd4793ad028c7cde6cf1b825a9f1b9d63d27e5e51fa12c552cef7611fea332385fdc6afd2081dc86d2b6662c1331c77b3a07c411e03e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-diskcache \
python310-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
