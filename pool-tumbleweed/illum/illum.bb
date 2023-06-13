SUMMARY = "A daemon that responds to brightness keys by changing the backlight level"
DESCRIPTION = "While there are tools that can be configured to adjust brightness illum adjusts \
brightness as soon as you install and enable it. \
 \
It uses exponential brightness stepping which happens to work well with many \
screens and is hard to achieve with a plain shell script bound to a key with \
more generic tool."
LICENSE = "AGPL-3.0-only"

PV = "0.5"

RPM_NAME = "illum-0.5-1.1.aarch64.rpm"
RPM_HASH = "57c5003d0d17de591f8606c96093db4174b45be89791b6870da5c9a762e8dcac9d6f39566f546cbdc1c496dc0c2264c2bec36f5ec1e51a47b73678c17d305656"

RPROVIDES:${PN} += "illum \
illum(aarch-64)"

RDEPENDS:${PN} += "libasan.so.8()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libev.so.4()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libubsan.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
