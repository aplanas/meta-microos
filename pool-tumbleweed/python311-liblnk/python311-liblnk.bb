SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python311-liblnk-20230716-2.1.aarch64.rpm"
RPM_HASH = "7870d99fe65b8a00e1f0185c2f3fee84d0356e2b17e09290b317aa146415ca90d3286e83765cbcd8ff7de21cac128d22de8458a97804322f6852971031ab7fe3"

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
