SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "python39-diskcache-5.6.3-1.1.noarch.rpm"
RPM_HASH = "98adaa869395db22a4ff7a7aa334115d254215c289b9c38fe70559ee417d50035ab8ed71bb2fe85eca806b83aa8ffbf03728d9e271ea8a9295e16af288881f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-diskcache \
python39-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
