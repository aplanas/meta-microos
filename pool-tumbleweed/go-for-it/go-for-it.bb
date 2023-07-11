SUMMARY = "A to-do list with built-in productivity timer"
DESCRIPTION = "Go For It! keeps track of tasks and assists in processing \
them subsequently. The timer avoids distraction by keeping the user's \
focus on the recent task, while issuing reminders to take short breaks \
on a regular basis."
LICENSE = "GPL-3.0"

PV = "1.6.3"

RPM_NAME = "go-for-it-1.6.3-1.27.aarch64.rpm"
RPM_HASH = "0c13f173e85b43b9dc64de38249b52d2446a97b0d5effc387652510384a146f18691a6e7855ffae750f046bd7815f76e98266d5df79bf12a3e911e04a63b7f8d"

RPROVIDES:${PN} += "go-for-it"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4"

inherit rpm
