SUMMARY = "Boot logging"
DESCRIPTION = "The blogd daemon determines the real underlying character device of \
/dev/console. Blogd spawns a pty/tty pair to reconnect the current \
/dev/console with the slave of the pty/tty pair. During writing \
information from this slave to the real character device a ring \
buffer is used to hold the information for writing it to an existing \
logging file."
LICENSE = "GPL-2.0-or-later"

PV = "2.26"

RPM_NAME = "blog-2.26-2.2.aarch64.rpm"
RPM_HASH = "3317e045ac73445fdf7ff8f3ba5b4ced3173fcd0ed18ebdf8a0354231e2ffc4455298d1949fb216e5db18322b46492a2b563191dd97ec714f9d16f2999e486ea"

RPROVIDES:${PN} += "/sbin/isserial \
blog \
blog(aarch-64) \
sysvinit-tools:/sbin/blogd"
RDEPENDS:${PN} += "coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblogger.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
