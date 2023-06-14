SUMMARY = "Multi-purpose cross-platform desktop calculator"
DESCRIPTION = "Qalculate! is a multi-purpose cross-platform desktop calculator. It is \
simple to use but provides power and versatility normally reserved for \
complicated math packages, as well as useful tools for everyday needs \
(such as currency conversion and percent calculation). Features include a \
large library of customizable functions, unit calculations and conversion, \
symbolic calculations (including integrals and equations), arbitrary \
precision, uncertainty propagation, interval arithmetic, plotting, and a \
user-friendly interface (GTK+ and CLI)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-gtk-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "78ec4a1c8583b3eee952b5556a93dde3274c3a3b18fb36af79b7f3ef0fb1f1ee541aeb74a84ba58f86bc28dab0ef8f01ce44e811005166d6e407611aa664ecdc"

RPROVIDES:${PN} += "qalculate-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libqalculate.so.22 \
libstdc++.so.6"

inherit rpm
