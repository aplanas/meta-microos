SUMMARY = "Boot logging"
DESCRIPTION = "The blogd daemon determines the real underlying character device of \
/dev/console. Blogd spawns a pty/tty pair to reconnect the current \
/dev/console with the slave of the pty/tty pair. During writing \
information from this slave to the real character device a ring \
buffer is used to hold the information for writing it to an existing \
logging file."
LICENSE = "GPL-2.0-or-later"

PV = "2.27"

RPM_NAME = "blog-2.27-1.1.aarch64.rpm"
RPM_HASH = "a3ad2c5ae9d598451f0fe1e954910693e75e05b2217247b15f5bcaa7024009b670bd85437b8be4827dec50af6715d131d02840d583f79cf8e4f73a5d4cf0a642"

RPROVIDES:${PN} += "/sbin/isserial \
blog \
sysvinit-tools-/sbin/blogd"

RDEPENDS:${PN} += "coreutils \
ld-linux-aarch64.so.1 \
libblogger.so.2 \
libc.so.6"

inherit rpm
