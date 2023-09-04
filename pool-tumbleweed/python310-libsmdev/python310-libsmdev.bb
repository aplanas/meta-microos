SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python310-libsmdev-20221028-3.1.aarch64.rpm"
RPM_HASH = "17411a3252ab59aec7da5bd5c1ee7b4f15633888adb78ad2f876619d15bcb941fb9853e20fe8087ca2f4df53505705e7247806c5e1003395871486637466467a"

RPROVIDES:${PN} += "python310-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
