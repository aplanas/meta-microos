SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python310-liblnk-20230716-2.1.aarch64.rpm"
RPM_HASH = "7780dc0e8ffde50675dfa9bd30609b1f95298ccc1949ea69021a0b47cb34085d86e543632f4e04f9912f98444b306fde05e31a8f9ca16c42540561ffe9782f50"

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
