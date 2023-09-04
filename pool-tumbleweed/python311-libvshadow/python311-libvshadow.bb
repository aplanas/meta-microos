SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python311-libvshadow-20221030-4.1.aarch64.rpm"
RPM_HASH = "6e88c086e3b6df760c463c5eef37cabd02ae7b85a9ec48d656818069c237a851f92be84b36efd49055a924003dc48eeb9d0b83c438bbac40c5a80c1b5b98d0b2"

RPROVIDES:${PN} += "python3-libvshadow \
python311-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
