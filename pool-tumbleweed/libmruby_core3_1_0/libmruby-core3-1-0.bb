SUMMARY = "Lightweight Ruby Embedded Environment"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libmruby_core3_1_0-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "9c0ad4051891cfd79ff168720681be009f2a31c3473b917de6f8a4dac8ac03fdadf6736b1f239da9a2edd584ff35fabac4ba7946e6306f011555abbd567c6165"

RPROVIDES:${PN} += "libmruby_core.so.3.1.0()(64bit) \
libmruby_core3_1_0 \
libmruby_core3_1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
