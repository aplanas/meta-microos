SUMMARY = "Task Manager for Elementary"
DESCRIPTION = "A task manager for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "agenda-1.1.2-1.10.aarch64.rpm"
RPM_HASH = "a8cbc4c610cf5b9619b202f08aa21c18819ef39819ecdefcbf192abd27761af76c72597ff12892e6597cc893aab46f0cb2ec2e014298a87248a667fd29b9cde9"

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
