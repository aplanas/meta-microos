SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python310-liblnk-20230716-1.1.aarch64.rpm"
RPM_HASH = "b880d6e32a2fc15377888bd3a3287de27353531aeb7a08ff4dc18956f1aaec296625ce63d5b99d7ccbbe2dd1b9c226cb03451580de2546c7d4597b6d6a2489ed"

RPROVIDES:${PN} += "python310-liblnk"

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
