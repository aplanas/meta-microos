SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "imlib2-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "2b5beac7c294894c8941fa37616a8be5e0ab3cea0b67403fc6410ebd339cbffacbd70eca0ec9e99644e9555c1fbcc3332b3b9b136f2a9fa35a8048971e1ad1a4"

RPROVIDES:${PN} += "imlib2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
