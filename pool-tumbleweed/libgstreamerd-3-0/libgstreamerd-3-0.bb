SUMMARY = "GtkD gstreamerd library"
DESCRIPTION = "This package contains the GtkD gstreamerd library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgstreamerd-3-0-3.9.0-2.12.aarch64.rpm"
RPM_HASH = "b9a592d67afd9c4d9d15919412269e5bcbbd8fea7bc09ff0ab7726f9b18cf3e6526c09a21d87ad2ce090bc20feb657ae52dcf415b7f5a43a12031ebb3a4f2bfb"

RPROVIDES:${PN} += "libgstreamerd-3-0 \
libgstreamerd-3-0(aarch-64) \
libgstreamerd-3.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libdruntime-ldc-shared.so.102()(64bit) \
libgcc_s.so.1()(64bit) \
libphobos2-ldc-shared.so.102()(64bit)"

inherit rpm
