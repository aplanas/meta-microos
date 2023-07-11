SUMMARY = "Guitarix runtime library"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "libgxwmm0-0.44.1-2.3.aarch64.rpm"
RPM_HASH = "b274224e43898dae2f2c05544abb48052e89a5fb36d4052df8e1fe41b1f8dbea5a32f0ef488b85b0e8bd347895e465993e4938bb27371e5e8b7c4d55d53425e7"

RPROVIDES:${PN} += "libgxwmm.so.0 \
libgxwmm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtkmm-3.0.so.1 \
libgxw.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
