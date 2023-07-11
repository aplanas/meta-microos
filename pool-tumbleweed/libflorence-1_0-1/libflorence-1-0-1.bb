SUMMARY = "Library files for florence"
DESCRIPTION = "Extensible scalable on-screen virtual keyboard. \
This package contains libraries."
LICENSE = "GPL-2.0-or-later & GFDL-1.2-only"

PV = "0.6.3"

RPM_NAME = "libflorence-1_0-1-0.6.3-5.11.aarch64.rpm"
RPM_HASH = "8ee3c6f4ef244468291f0a67623089294fac9e1e5d19631898a9acb7c7e26b243559defc516b0d00c5ee31802555369c5cb5bfe69570211350179632cc7b1c33"

RPROVIDES:${PN} += "libflorence-1-0-1 \
libflorence-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
