SUMMARY = "Run-time library to control radio transcievers and receivers"
DESCRIPTION = "The Ham Radio Control Libraries (Hamlib) provide a programming \
interface for controlling radios and other shack hardware. \
It is a software layer, not a complete user application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "hamlib-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "ecba0d8725b93545b5d6965002dcbef7c2eae07c6e19c370f97b3e67aba81f290b0e242f186c50ccff5bea79b4efc33bdce42139c74d275bd567c4447758c4be"

RPROVIDES:${PN} += "hamlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
libreadline.so.8 \
libusb-1.0.so.0 \
libxml2.so.2"

inherit rpm
