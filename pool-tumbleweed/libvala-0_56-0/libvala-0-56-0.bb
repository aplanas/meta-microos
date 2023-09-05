SUMMARY = "Vala programming language runtime"
DESCRIPTION = "Runtime library for the Vala programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "libvala-0_56-0-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "a015300a1f75625bfaae227fd64eef7683afe587f512b7257bd370fb7cda2172d462ed4c8558b1ba540013e3ddbfd68d62747c480ae92de6bd0871b88fa6dc6f"

RPROVIDES:${PN} += "libvala-0-56-0 \
libvala-0.56.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
