SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python311-libregf-20230319-1.6.aarch64.rpm"
RPM_HASH = "9494cedb010012068a0fa815048b8b4db553143b67905a8b5a23fb114e80ad2c4b6c67a77ffe98a31bc85484b5a0f8272c7dad6a9e4fc2ee865fedbc5636ef24"

RPROVIDES:${PN} += "python3-libregf \
python311-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
