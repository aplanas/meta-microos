SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.1"

RPM_NAME = "python310-diskcache-5.6.1-1.1.noarch.rpm"
RPM_HASH = "f9589efe40f42cd08f25c82f96e3446c4aa5f2e3f9cb2fc36924b50405fe25749100529b0aec7b39e6a942b4dd6a0e2c6f27d07e39d175c42e7ca27c79f3e4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diskcache \
python3.10dist(diskcache) \
python310-diskcache \
python3dist(diskcache)"

RDEPENDS:${PN} += "python(abi) \
python310"

inherit rpm
