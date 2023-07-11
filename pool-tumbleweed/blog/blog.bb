SUMMARY = "Boot logging"
DESCRIPTION = "The blogd daemon determines the real underlying character device of \
/dev/console. Blogd spawns a pty/tty pair to reconnect the current \
/dev/console with the slave of the pty/tty pair. During writing \
information from this slave to the real character device a ring \
buffer is used to hold the information for writing it to an existing \
logging file."
LICENSE = "GPL-2.0-or-later"

PV = "2.26"

RPM_NAME = "blog-2.26-2.3.aarch64.rpm"
RPM_HASH = "61bc03f72ec494d6bf21964e88ad5c2bebf14db4382682176ece59d8b18cc73738b59c5880d7ef8f0c5922fa65e6229dfda4ad543facff3ee00e1dc7d5ba3013"

RPROVIDES:${PN} += "/sbin/isserial \
blog \
sysvinit-tools-/sbin/blogd"

RDEPENDS:${PN} += "coreutils \
ld-linux-aarch64.so.1 \
libblogger.so.2 \
libc.so.6"

inherit rpm
