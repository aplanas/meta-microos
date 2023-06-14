SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python311-libfwnt-20220922-2.5.aarch64.rpm"
RPM_HASH = "d4344d4ef6ebd7907dc46023b95b35c6c87759f22acc4d917f68317826dbdcbd652115caedc6745ad79106db13f875560758798e03be231311992d6c60796c25"

RPROVIDES:${PN} += "python311-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
