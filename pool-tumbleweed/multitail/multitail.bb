SUMMARY = "Tail Multiple Files"
DESCRIPTION = "MultiTail lets you view one or multiple files like the original \
tail program. \
 \
The difference is that it creates multiple windows on your console \
(with ncurses). Merging of 2 or even more logfiles is possible. \
 \
It can also use colors while displaying the logfiles (through \
regular expressions), for faster recognition of what is important \
and what not. It can also filter lines (again with regular \
expressions). It has interactive menus for editing given regular \
expressions and deleting and adding windows. One can also have \
windows with the output of shell scripts and other software. When \
viewing the output of external software, MultiTail can mimic the \
functionality of tools like 'watch' and such."
LICENSE = "GPL-2.0+"

PV = "6.5.0"

RPM_NAME = "multitail-6.5.0-1.12.aarch64.rpm"
RPM_HASH = "e00fe682353f4fa040c7cc05fa56751defad056f89baeef59da97f57da1fcc3fc41a081a7fe349ca52177e2c271ccd7c9de7d68cfcb92151dc8a812946e2951b"

RPROVIDES:${PN} += "config-multitail \
multitail"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
