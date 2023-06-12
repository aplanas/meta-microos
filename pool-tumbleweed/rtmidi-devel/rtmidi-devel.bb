SUMMARY = "Development files for rtmidi"
DESCRIPTION = "C++ library for realtime MIDI input/ouput. \
 \
This package contains header files and libraries needed to develop \
application that use rtmidi."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "rtmidi-devel-5.0.0-1.7.aarch64.rpm"
RPM_HASH = "aa81b8cbfb1b2d75e19f26e85e8284780f5be628b962a8a77d58dac3b6e35ae764f180a40ecc135df7916a847a6883e825a7fa40e42d69870d4636ca0fac1e87"

RPROVIDES:${PN} += "pkgconfig(rtmidi) \
rtmidi-devel \
rtmidi-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
librtmidi6 \
pkgconfig(alsa) \
pkgconfig(jack)"

inherit rpm
