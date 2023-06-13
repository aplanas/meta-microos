SUMMARY = "Library files for florence"
DESCRIPTION = "Extensible scalable on-screen virtual keyboard. \
This package contains libraries."
LICENSE = "GPL-2.0-or-later & GFDL-1.2-only"

PV = "0.6.3"

RPM_NAME = "libflorence-1_0-1-0.6.3-5.10.aarch64.rpm"
RPM_HASH = "f5806256c7204edb5ebae1c92a567335d8ef6a2911a367bcd25941ad996ad02532e5878b3db5a5bcedbe33cac488433d444525e615e085925a16570343b437b1"

RPROVIDES:${PN} += "libflorence-1.0.so.1()(64bit) \
libflorence-1_0-1 \
libflorence-1_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
