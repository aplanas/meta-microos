SUMMARY = "Task Manager for Elementary"
DESCRIPTION = "A task manager for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "agenda-1.1.2-1.11.aarch64.rpm"
RPM_HASH = "2da6291677b40c5c8c4f2963494d4d75b37edd94b10db9ecb13319c9d7eeb6ec5f9ccf433dda66e1390fd6699699ce5fea20f93c2fad1c55c65380e0f80edcec"

RPROVIDES:${PN} += "agenda \
agenda-tasks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
