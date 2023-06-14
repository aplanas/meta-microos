SUMMARY = "Do maths like a normal person"
DESCRIPTION = "This is an application where you do calculations 'like a normal \
person'. It lets you type whatever you want, smartly figures out what \
computations are needed, and outputs an answer on the right pane. \
Then you can plug those answers in to future equations and if that \
answer changes, so does the equations it is used in."
LICENSE = "GPL-3.0-only"

PV = "0.5.4"

RPM_NAME = "nasc-0.5.4-2.18.aarch64.rpm"
RPM_HASH = "9e210d9a8573737c2e9ac18c8cc59e3e393ea624fea95bbf129bcdd87b282770c4d3694dd3dc06c9092244c8d68ab8440c03b7b793e429fed612458b740a61bc"

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
