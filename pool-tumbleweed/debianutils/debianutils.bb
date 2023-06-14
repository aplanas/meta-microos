SUMMARY = "Miscellaneous utilities specific to Debian"
DESCRIPTION = "* add-shell: add a shell to /etc/shells \
* ischroot: etects if it is currently running in a chroot \
* run-parts: run scripts or programs in a directory \
* remove-shell: remove a shell to /etc/shells \
* update-shells: update the list of valid login shells"
LICENSE = "GPL-2.0-only"

PV = "5.4"

RPM_NAME = "debianutils-5.4-2.1.aarch64.rpm"
RPM_HASH = "9eed53f7c27959e62faa5a69af06ac84ff569de8a10ebd11e56c5bda78f46e291b91304ee40cb7658394089bd76bd40b91717f2ef317b604411584dc9e6e3008"

RPROVIDES:${PN} += "debianutils"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
