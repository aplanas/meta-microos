SUMMARY = "Full featured font file preview application for GTK+ Desktop Environments"
DESCRIPTION = "This package contains the font-viewer component of font-manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "font-viewer-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "2334f2f7f156c0a4892bc7a3fbc5e9069a8b98ddce131db52ad4f5a8152b04f641282f70585b89e0c60c249b26dbf2b06b15566ccd5643f1f3b479848370c497"

RPROVIDES:${PN} += "font-viewer"

RDEPENDS:${PN} += "font-manager-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsqlite3.so.0"

inherit rpm
