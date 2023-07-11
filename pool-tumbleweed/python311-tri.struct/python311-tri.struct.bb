SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python311-tri.struct-4.1.0-1.6.aarch64.rpm"
RPM_HASH = "d40703444114877577a6415a71ac46492b663da64deea6708b7161b86748b57ff7dab9aef7742654f93ded5d1c6d1c479e3ddd6db4e19e2758fda1a05fa2b2fd"

RPROVIDES:${PN} += "python3-tri.struct \
python3.11dist-tri.struct \
python311-tri.struct \
python3dist-tri.struct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
