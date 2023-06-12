SUMMARY = "Development files for libsigrok, an API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats. \
 \
This subpackage contains the headers to make use of the sigrok shared \
libraries."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrok-devel-0.5.2-4.12.aarch64.rpm"
RPM_HASH = "9106762fa9ae39300a07090c926a7c4a66e46e7c430b6bfbd434d73f036ebef6f9a689b0c1d867ace3478fdd1e38c4651b11857dbc52b60edf260fee11ab296f"

RPROVIDES:${PN} += "libsigrok-devel \
libsigrok-devel(aarch-64) \
pkgconfig(libsigrok) \
pkgconfig(libsigrokcxx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigrok4 \
libsigrokcxx4 \
pkgconfig(bluez) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(glibmm-2.4) \
pkgconfig(hidapi-hidraw) \
pkgconfig(libftdi1) \
pkgconfig(libserialport) \
pkgconfig(libsigrok) \
pkgconfig(libtirpc) \
pkgconfig(libusb-1.0) \
pkgconfig(libzip)"

inherit rpm
