SUMMARY = "Logitech Unifying Receiver configuration library"
DESCRIPTION = "A library to configure and handle the /dev hidraw devices belonging \
to the 'Unifying' wireless receiver."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "liblur3-0.17-2.1.aarch64.rpm"
RPM_HASH = "ed727c85f73b053f64d0ff5eed157ae2807cf39f45079b91f3e6237afb7a4aa924a5c92c198cb5de49b89e94f45e08cc97431af278610a0b609ee2ff388f225d"

RPROVIDES:${PN} += "liblur.so.3()(64bit) \
liblur3 \
liblur3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
