SUMMARY = "Helper program for using a pipe for SSH authentication"
DESCRIPTION = "fd0ssh a helper program used by non-interactive programs, for example \
pam_mount, that want to pipe a password to ssh. It works similar in \
spirit to expect(1), but implements much less features."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "fd0ssh-20230411-1.2.aarch64.rpm"
RPM_HASH = "b5accd0979877a017a708cd3b6ab122bac5eab2db028a416ff5540f133d17c5a4bfb7b3a4c09fc85dee073db85ca846ec96b2bf0e3f471705f86421818b0365e"

RPROVIDES:${PN} += "fd0ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
