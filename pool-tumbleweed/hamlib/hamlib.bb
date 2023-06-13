SUMMARY = "Run-time library to control radio transcievers and receivers"
DESCRIPTION = "The Ham Radio Control Libraries (Hamlib) provide a programming \
interface for controlling radios and other shack hardware. \
It is a software layer, not a complete user application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "hamlib-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "549622c8affabe43af9f0159ee5b73cd59f1f688b064065381f96adb19c29410d614a16de08622348a392ba8e6f5ab58d0857a823df65ee4d68c898c6a17199c"

RPROVIDES:${PN} += "hamlib \
hamlib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhamlib.so.4()(64bit) \
libreadline.so.8()(64bit) \
libusb-1.0.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
