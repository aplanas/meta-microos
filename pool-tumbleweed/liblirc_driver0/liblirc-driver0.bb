SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC driver library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc_driver0-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "a2f6db34306bbfcd76cca898b8673dc57153b951f6c3c79e8ee6ed4f5335d7204b81d431569d0916d910c5f7fb5a5a1342164bf964927a3d9ffa8920ead11b78"

RPROVIDES:${PN} += "liblirc-driver.so.0 \
liblirc-driver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc.so.0 \
libudev.so.1"

inherit rpm
