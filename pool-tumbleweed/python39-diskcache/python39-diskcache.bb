SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.1"

RPM_NAME = "python39-diskcache-5.6.1-1.3.noarch.rpm"
RPM_HASH = "46f4a0ab6e81620c56864df3058015284fcf25fb3f856d3bf00db9a10ac2a9dd64ccb74e3cafdae63c478b969c0733818fe359bbdb3efd0bb80845025f49bc08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-diskcache \
python39-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
