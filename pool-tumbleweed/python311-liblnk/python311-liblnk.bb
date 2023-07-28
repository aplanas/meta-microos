SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python311-liblnk-20230716-1.1.aarch64.rpm"
RPM_HASH = "083234a589985e669d4fac3b3bd6c62ff666166f35710e1f803a24e7dcb75592e1b9638dad017671b2104994ac69dd64d23c20dd179f5205797288f4f2000e9f"

RPROVIDES:${PN} += "python3-liblnk \
python311-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
