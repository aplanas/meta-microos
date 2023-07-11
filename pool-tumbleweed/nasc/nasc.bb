SUMMARY = "Do maths like a normal person"
DESCRIPTION = "This is an application where you do calculations 'like a normal \
person'. It lets you type whatever you want, smartly figures out what \
computations are needed, and outputs an answer on the right pane. \
Then you can plug those answers in to future equations and if that \
answer changes, so does the equations it is used in."
LICENSE = "GPL-3.0-only"

PV = "0.5.4"

RPM_NAME = "nasc-0.5.4-2.19.aarch64.rpm"
RPM_HASH = "c79dc4dabd7b89de516899898027bb4719f9b83f948a1be0e81d23c2b31e83c090b64f7687dfdd845f1199ee6e8f305d6f91e1a64b509da7c375237e2381cd03"

RPROVIDES:${PN} += "nasc"

RDEPENDS:${PN} += "cln \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libpango-1.0.so.0 \
libqalculate.so.22 \
libsoup-2.4.so.1 \
libstdc++.so.6 \
qalculate"

inherit rpm
