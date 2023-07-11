SUMMARY = "SSH protocol access from Guile"
DESCRIPTION = "The shared libraries for guile-ssh, which let you access the SSH protocol from \
Guile."
LICENSE = "GPL-3.0-or-later"

PV = "0.16.3"

RPM_NAME = "libguile-ssh14-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "7f44220f893dd7f465f4e7beb9587a5c584c3f6da96701d745d775cf27d80908b4b219e8c5b458c54f259b708f8624ac1afad26ffed6d8a5ab83dafac29af619"

RPROVIDES:${PN} += "libguile-ssh.so.14 \
libguile-ssh14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libssh.so.4"

inherit rpm
