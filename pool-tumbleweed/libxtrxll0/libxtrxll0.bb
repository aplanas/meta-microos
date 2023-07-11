SUMMARY = "XTRX Low-level API library"
DESCRIPTION = "Low level XTRX hardware abstraction library."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrxll0-0.0.0+git.20201202-2.7.aarch64.rpm"
RPM_HASH = "cd2f303511a449fc4a6ea2ad02a9d557702e5b3fbb36df4e793a5b0686781e4baa9a89ff8b1a26fc5f51fc8b3642ff46dda6c4dd0de10304fc4bfff7ad2e1d08"

RPROVIDES:${PN} += "libxtrxll.so.0 \
libxtrxll0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb3380.so.0 \
xtrx-usb-udev"

inherit rpm
