SUMMARY = "FireWire 1394 support for audio devices"
DESCRIPTION = "This package provides the libffado shared library that \
provides a unified programming interface to configure and \
use all supported devices. Currently this library is used \
by the 'firewire' backends of the jack audio connection kit \
sound server. This backend provides audio and midi support, \
and is available in jackd. Access to the device internal \
configuration (e,g, internal mixer) is exposed using the \
ffado-dbus-server daemon. This daemon exposes the \
configurable parameters of all detected devices through \
DBUS. The ffadomixer application in support/mixer presents \
a GUI to control these parameters (only for officially \
supported devices)."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3"

RPM_NAME = "libffado2-2.4.3-3.1.aarch64.rpm"
RPM_HASH = "5c27b48a7b35790c47be7d64c8193cac1314a1528a102f5ed7c3be7b3932c55e9b163fb57ef85bd53436b01774c9e3f3edbe699654dd7482c6aa239f0b7887ad"

RPROVIDES:${PN} += "libffado.so.2()(64bit) \
libffado2 \
libffado2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libconfig++.so.11()(64bit) \
libgcc_s.so.1()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libiec61883.so.0()(64bit) \
libm.so.6()(64bit) \
libraw1394.so.11()(64bit) \
librom1394.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxml++-3.0.so.1()(64bit)"

inherit rpm
