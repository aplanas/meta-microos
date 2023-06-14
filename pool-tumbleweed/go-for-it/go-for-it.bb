SUMMARY = "A to-do list with built-in productivity timer"
DESCRIPTION = "Go For It! keeps track of tasks and assists in processing \
them subsequently. The timer avoids distraction by keeping the user's \
focus on the recent task, while issuing reminders to take short breaks \
on a regular basis."
LICENSE = "GPL-3.0"

PV = "1.6.3"

RPM_NAME = "go-for-it-1.6.3-1.26.aarch64.rpm"
RPM_HASH = "6cfeee504072f2a18a9093b014b1bd27e1226bcaf19c619bea166bc69f2ac9915e8d074a09cff220b60b917ef1677c7aa85534575358fb52cb07fc64003389b5"

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
