SUMMARY = "A to-do list with built-in productivity timer"
DESCRIPTION = "Go For It! keeps track of tasks and assists in processing \
them subsequently. The timer avoids distraction by keeping the user's \
focus on the recent task, while issuing reminders to take short breaks \
on a regular basis."
LICENSE = "GPL-3.0"

PV = "1.6.3"

RPM_NAME = "go-for-it-1.6.3-1.26.aarch64.rpm"
RPM_HASH = "6cfeee504072f2a18a9093b014b1bd27e1226bcaf19c619bea166bc69f2ac9915e8d074a09cff220b60b917ef1677c7aa85534575358fb52cb07fc64003389b5"

RPROVIDES:${PN} += "application() \
application(com.github.jmoerman.go-for-it.desktop) \
go-for-it \
go-for-it(aarch-64) \
metainfo() \
metainfo(com.github.jmoerman.go-for-it.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit)"

inherit rpm
