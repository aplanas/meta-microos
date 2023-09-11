SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "python310-diskcache-5.6.3-1.1.noarch.rpm"
RPM_HASH = "d2da900854f3ef8a0f768b3f95752f5e8e04431509c54b304462879cd32b600f5a870814b05ebf1bbc6a72f325b9f7ea93b8d181867d9c020a13ea7ae2b4774b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-diskcache \
python310-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
