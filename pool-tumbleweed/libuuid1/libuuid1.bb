SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "libuuid1-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "eef5241b1dd4d2e671636d3595f200172c4a55cd444285316a69006df2a0510c0ebd8422502dd3d7c513d50275a1c632980b1a489124338eafbcafac2bafe8af"

RPROVIDES:${PN} += "libuuid--uuid-generate-time-cont \
libuuid.so.1 \
libuuid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
