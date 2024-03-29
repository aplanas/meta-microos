SUMMARY = "GNOME plugin for displaying and Converting Metafile Images"
DESCRIPTION = "This library interprets metafile images and can either display them \
using the X Window System or convert them to standard formats such as \
PNG, JPEG, PS, EPS, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "libwmf-gnome-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "f4b4ef485c7f6cc55d8a71ce7be427ef4a8462532ae7b62bacfb6e6dd7eda5460ddaf3c00ff03955298192289b656e255f93adf48e4df478b73e660d9250e224"

RPROVIDES:${PN} += "libwmf-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7"

inherit rpm
