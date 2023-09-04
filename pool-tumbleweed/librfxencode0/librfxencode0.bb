SUMMARY = "Library for the JPEG2000 codec for RDP"
DESCRIPTION = "This package contains libraries for the JPEG2000 codec for RDP."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.22.1"

RPM_NAME = "librfxencode0-0.9.22.1-1.1.aarch64.rpm"
RPM_HASH = "96dff15c0b685fcd60ea5ae50fc27d367fbc8ba88ea0e2d5021c6adc3f913cfd32e46178158c9990fe95a1ff484733afe8f5388b9d357d88b895bc1bff990c8e"

RPROVIDES:${PN} += "librfxencode.so.0 \
librfxencode0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
