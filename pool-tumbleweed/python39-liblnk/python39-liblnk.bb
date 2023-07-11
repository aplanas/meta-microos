SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python39-liblnk-20230205-1.7.aarch64.rpm"
RPM_HASH = "fbc1fec89f45c928986b2b2233fb0ac9705593324ba5a8f52e47a482ceaf55f978a452245cbcd6d65c8acc581a20ad8ec2562127b3c7539d44d01ea11f2747d4"

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
