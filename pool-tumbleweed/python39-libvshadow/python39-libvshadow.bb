SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python39-libvshadow-20221030-4.1.aarch64.rpm"
RPM_HASH = "825a98428837c1064bf2c963874d23012b002a957890a4b8f13eb01155a98486140ced7a35b3dd72593cc7211612ba4c7f98f06a026477e401cd8444fe80b60e"

RPROVIDES:${PN} += "python39-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
