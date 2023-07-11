SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cpp12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "846e71cfaefc87d75b0e28abd1b989f7b7adaf60f129689ec21687f4217f085488930e161020fd5710c59b05f4e0f94cfe02d8432927681883cb2d4d31082455"

RPROVIDES:${PN} += "cpp12"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
