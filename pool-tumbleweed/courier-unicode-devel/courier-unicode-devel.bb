SUMMARY = "Courier Unicode Library - Development files"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libunicode library."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.6"

RPM_NAME = "courier-unicode-devel-2.2.6-1.4.aarch64.rpm"
RPM_HASH = "4930a6fe9bb2b3165ef42f910389aa61d043b69e66aa6d4bf6a4dac80376507f8c699ce76fbe2f72c1e4d9ee1e04667fb7ec8353cb4d479d91854b5c6be92d53"

RPROVIDES:${PN} += "courier-unicode-devel \
libcourier-unicode-devel"

RDEPENDS:${PN} += "libcourier-unicode7"

inherit rpm
