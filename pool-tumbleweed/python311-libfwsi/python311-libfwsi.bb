SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "python311-libfwsi-20230710-2.1.aarch64.rpm"
RPM_HASH = "0c85aab6397589e98a3ab295b1742091dc77a51fb90b70223a75af7b481c11db610f09edbe3b6c8edb0c5d3be3b6da329d8f541fa0c5e1bf01490fa09405cfa4"

RPROVIDES:${PN} += "python3-libfwsi \
python311-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
