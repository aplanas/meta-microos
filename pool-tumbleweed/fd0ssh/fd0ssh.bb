SUMMARY = "Helper program for using a pipe for SSH authentication"
DESCRIPTION = "fd0ssh a helper program used by non-interactive programs, for example \
pam_mount, that want to pipe a password to ssh. It works similar in \
spirit to expect(1), but implements much less features."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "fd0ssh-20230411-1.1.aarch64.rpm"
RPM_HASH = "dd8ef4fb6762314f08481f962c328cf64aa005175a03b6af5b5d47328f99542da45a10165ce93c0fd258f6ea2fb4fb86fd0fbf4ac2f4c431ef3a07efba4c42a3"

RPROVIDES:${PN} += "fd0ssh \
fd0ssh(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
