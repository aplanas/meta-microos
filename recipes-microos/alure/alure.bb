SUMMARY = "Audio Library Tools REloaded"
DESCRIPTION = "ALURE is a utility library to help manage common tasks with OpenAL \
applications. This includes device enumeration and initialization, \
file loading, and streaming."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "alure-1.2-4.4.aarch64.rpm"
RPM_HASH = "a060cee4f58f441170b839dd1a1565e7167fc53b5a66220373f2df83cb2edd3989c73fd0341619303f41159d8fe4ef0cae67170a0ea74602b4e8eda9f2375f8f"

RPROVIDES:${PN} += "alure alure(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libalure.so.1()(64bit) libalure.so.1(LIBALURE_1.0)(64bit) libalure.so.1(LIBALURE_1.1)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenal.so.1()(64bit)"

inherit rpm
