SUMMARY = "Lightweight Ruby Embedded Environment"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libmruby3_1_0-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "c614ce853315f8216acc2cb4f3a47c43b60d94602761b9159971210fe1d455f2fba469c5d570433418a295b5773062c00ce3860b945ecc760e7b0ef702015ae2"

RPROVIDES:${PN} += "libmruby.so.3.1.0()(64bit) \
libmruby3_1_0 \
libmruby3_1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
