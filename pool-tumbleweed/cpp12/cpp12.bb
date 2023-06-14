SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cpp12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "c808ff6434cfb6a9b40a65692403dbbac38730d6fb086b5392f28818ff477b2a23ca495b9ca013d4b57157a2406dcbcd51ce9f8a25e15c615b4dfb34a064f957"

RPROVIDES:${PN} += "cpp12"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
