SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python311-libvshadow-20221030-3.5.aarch64.rpm"
RPM_HASH = "cbe43ba64c4e0c595ecfb55da3910c7f39dbb71d6a89cdbb6a519e1937aa4964c6e6e5f2ec850813a0ddbbdf7c6c99353debadf05769ef017969a1037774168a"

RPROVIDES:${PN} += "python311-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
