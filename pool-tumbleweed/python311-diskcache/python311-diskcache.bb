SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.1"

RPM_NAME = "python311-diskcache-5.6.1-1.3.noarch.rpm"
RPM_HASH = "22db0c967873cc74649290619c601a5ca8fa367f2aa046127919919eb220d6ad950f699014d0e3a2370f7c02a936323c68778e47c5358a3b5fa447e04b605c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diskcache \
python3.11dist-diskcache \
python311-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
