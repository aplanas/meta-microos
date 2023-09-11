SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "python311-diskcache-5.6.3-1.1.noarch.rpm"
RPM_HASH = "c22359a48b584022814b417f25872d4a477f30588caffa95ab0e1c67f795a9f2299ef5cff439a4c7b01ca67496014d5045b1558c3dc7e0b2688286d16fe74737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diskcache \
python3.11dist-diskcache \
python311-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
