SUMMARY = "Next Generation Image Acquisition Utilities"
DESCRIPTION = "This software provides applications to easily turn hard-copy documents and \
imagery into formats that are more amenable to computer processing. \
 \
Included are a native driver for a number of EPSON scanners and a compatibility \
driver to interface with software built around the SANE standard. \
 \
This is the community maintained fork, based on imagescan upstream."
LICENSE = "GPL-3.0-or-later"

PV = "1638580181.839d06a"

RPM_NAME = "utsushi-1638580181.839d06a-2.9.aarch64.rpm"
RPM_HASH = "026e763432404bd5d2183cc3367cf1e751b46ea7ef42f2b95b334d999e8b4a50ce756725798044dd3532af674bae664d001f508c81fd38742ac9d17108a0f987"

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
