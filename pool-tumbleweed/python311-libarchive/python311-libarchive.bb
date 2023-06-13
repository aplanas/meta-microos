SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python311-libarchive-0.4.7-3.12.noarch.rpm"
RPM_HASH = "22734866cf1d620078c45cd5f65ce8cc31f7da6f332e2cb2ebf2ce078ac06c0ee05b9c7617e024d4ec5cd130554771c5f924bf7fc7ac36c0d11e6435b62940ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(libarchive) \
python311-libarchive \
python3dist(libarchive)"

RDEPENDS:${PN} += "libarchive-devel \
python(abi)"

inherit rpm
