SUMMARY = "Next Generation Image Acquisition Utilities"
DESCRIPTION = "This software provides applications to easily turn hard-copy documents and \
imagery into formats that are more amenable to computer processing. \
 \
Included are a native driver for a number of EPSON scanners and a compatibility \
driver to interface with software built around the SANE standard. \
 \
This is the community maintained fork, based on imagescan upstream."
LICENSE = "GPL-3.0-or-later"

PV = "1684035837.b296671"

RPM_NAME = "utsushi-1684035837.b296671-4.1.aarch64.rpm"
RPM_HASH = "0ecc48ff8e2d2909fafdc77ba0a61a3ff6b126ca6bdc6a03da2bd4e20515bbeb00b2f60224c7bb9c6980ce450f23ea90d601473decbaa3368111e83a84c69984"

RPROVIDES:${PN} += "config-utsushi \
imagescan \
libcnx-hexdump.so \
libcnx-usb.so \
libdrv-combo.so \
libdrv-esci.so \
libflt-all.so \
libsane.so.1 \
libutsushi-gtkmm.so \
libutsushi.so \
utsushi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libatkmm-1.6.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdkmm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtkmm-2.4.so.1 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libudev.so.1 \
libusb-1.0.so.0"

inherit rpm
