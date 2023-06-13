SUMMARY = "Tool to backup GnuPG secret keys on paper"
DESCRIPTION = "A reasonable way to achieve a long term backup of OpenPGP (GnuPG, PGP, etc) \
keys is to print them out on paper. Paper and ink have amazingly long retention \
qualities - far longer than the magnetic or optical means that are generally \
used to back up computer data."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "paperkey-1.6-1.17.aarch64.rpm"
RPM_HASH = "e3ec582396df2b7c91d58b739923be93c462f262d9ee39808d327628f13893dac2c6bf0ecd04fe2b21a7addb1c1c2f1252c522fc646c0b8d1b0d7b54e5e834b8"

RPROVIDES:${PN} += "paperkey \
paperkey(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
