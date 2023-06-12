SUMMARY = "Task Manager for Elementary"
DESCRIPTION = "A task manager for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "agenda-1.1.2-1.10.aarch64.rpm"
RPM_HASH = "a8cbc4c610cf5b9619b202f08aa21c18819ef39819ecdefcbf192abd27761af76c72597ff12892e6597cc893aab46f0cb2ec2e014298a87248a667fd29b9cde9"

RPROVIDES:${PN} += "agenda \
agenda(aarch-64) \
agenda-tasks \
application() \
application(com.github.dahenson.agenda.desktop) \
metainfo() \
metainfo(com.github.dahenson.agenda.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
