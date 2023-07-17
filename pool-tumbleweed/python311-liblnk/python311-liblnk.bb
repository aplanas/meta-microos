SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python311-liblnk-20230205-1.8.aarch64.rpm"
RPM_HASH = "c757aea79a57712c9f5411498f4df049d58627574d6a3db7984349306cfead9042ef418e4ad4608019fa5e9ebd4207081f3930b6f2f81a96d0751e7a1b12a863"

RPROVIDES:${PN} += "python3-liblnk \
python311-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
python-abi"

inherit rpm
