SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "python310-libfwsi-20230710-1.1.aarch64.rpm"
RPM_HASH = "bd2a6cb030028592e7aa188f9af27e5952b88a7f84d517c7ce892cf7693e5b73263d82974f9dad65e3360b75f34961f00aff69526c3ca364705f8b748565fb63"

RPROVIDES:${PN} += "python310-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
