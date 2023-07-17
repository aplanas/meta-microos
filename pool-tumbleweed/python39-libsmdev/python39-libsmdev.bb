SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python39-libsmdev-20221028-2.12.aarch64.rpm"
RPM_HASH = "96737f662d654709589f12e1515e170fce7338d411b4d4643ce45381cc79844c814592ba1f52293e797fbb7982560297d6c8ce16acdcb183c9f5602ce8930665"

RPROVIDES:${PN} += "python39-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
