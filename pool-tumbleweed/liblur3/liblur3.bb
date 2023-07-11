SUMMARY = "Logitech Unifying Receiver configuration library"
DESCRIPTION = "A library to configure and handle the /dev hidraw devices belonging \
to the 'Unifying' wireless receiver."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "liblur3-0.17-2.2.aarch64.rpm"
RPM_HASH = "f8cb2dfdbd14399421f409a9db0b6015487f749af0a685d80a89390ee1f6cb535580861bbd61ba0d6ccaa9f0ec51669610b1ca247cad1b124e0e3a240ee2419a"

RPROVIDES:${PN} += "liblur.so.3 \
liblur3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
