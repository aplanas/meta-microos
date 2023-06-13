SUMMARY = "Development files for hamlib, a set of radio control libraries"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "hamlib-devel-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "f5f858bc07b0b65127679785d4690abccb871c1e8f4ae8fc067a1b014a7e41d16eb57b4a298bcb2d73c2f6c893bf6111bc6dc2c2700f2c30b032aa5b511b70fe"

RPROVIDES:${PN} += "hamlib-devel \
hamlib-devel(aarch-64) \
pkgconfig(hamlib)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhamlib++4 \
libhamlib4 \
pkgconfig(libusb-1.0)"

inherit rpm
