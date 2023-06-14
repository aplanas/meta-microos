SUMMARY = "SSH protocol access from Guile"
DESCRIPTION = "The shared libraries for guile-ssh, which let you access the SSH protocol from \
Guile."
LICENSE = "GPL-3.0-or-later"

PV = "0.16.0"

RPM_NAME = "libguile-ssh14-0.16.0-1.2.aarch64.rpm"
RPM_HASH = "83f4fe60fb59921e06e9872ae4c0c881a75fc0e0b1fb60943b1500c28d5c47d0d2c05b765fb5497de3876a111e5f29540052963a60700006a3439293dbeec7e1"

RPROVIDES:${PN} += "libguile-ssh.so.14 \
libguile-ssh14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libssh.so.4"

inherit rpm
