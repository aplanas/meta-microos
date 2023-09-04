SUMMARY = "Tools for basic booting"
DESCRIPTION = "Helper tools from sysvinit that support booting, including but not exclusive \
to startpar and killproc. System V init specific programs are in the \
sysvinit package."
LICENSE = "GPL-2.0-or-later"

PV = "3.08"

RPM_NAME = "sysvinit-tools-3.08-1.1.aarch64.rpm"
RPM_HASH = "d0d4eee1d82a3f322751e22c3f89b7ce9cce8cc9691456b56e00ac6438dfb6ef88bacf309332ad3c0274aebfa1b1c2ba7156ad44addace65998c2eff0d7ab04a"

RPROVIDES:${PN} += "/sbin/start-daemon \
/sbin/startproc \
sysvinit-tools"

RDEPENDS:${PN} += "blog \
ld-linux-aarch64.so.1 \
libblogger.so.2 \
libc.so.6"

inherit rpm
