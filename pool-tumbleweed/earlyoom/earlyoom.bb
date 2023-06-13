SUMMARY = "Early OOM Daemon for Linux"
DESCRIPTION = "earlyoom checks the amount of available memory and free swap, and if both are \
below critical level, it will kill the largest process (highest oom_score)."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "earlyoom-1.7-1.3.aarch64.rpm"
RPM_HASH = "709fbade46868600fb4c71f0d29f84aa00f0eac97a048674a0de9c77055ec6066ac91a393f646ba09964c2ac0877f4b7d61272d1dc8757dfd5c2b366a017640a"

RPROVIDES:${PN} += "earlyoom \
earlyoom(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
