SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cpp13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "e9e30ddd6c8a2d05a89cc76cbf93c4d07109e2ed2d69274bbf30ac07e66afe2cef3091dda032f74620bf8b9c6018b24f56d711b6cec68302a6df7a60519c57f4"

RPROVIDES:${PN} += "cpp13"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
