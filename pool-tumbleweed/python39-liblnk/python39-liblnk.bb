SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python39-liblnk-20230205-1.8.aarch64.rpm"
RPM_HASH = "8bfcaf1ce604fe1af85d5cbda7926a8a42e1c6efa0d1ad8802879c5140fa9f730eaa73eb226867061d3a67f4f26c537dd850a155f03a7411d385290f960f7da3"

RPROVIDES:${PN} += "python39-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
python-abi"

inherit rpm
