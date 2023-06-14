SUMMARY = "Tools for manipulating machine owner keys"
DESCRIPTION = "This program provides the means to enroll and erase the machine owner \
keys (MOK) stored in the database of shim."
LICENSE = "GPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "mokutil-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "e8eaa034365aa94e04cef1a57618451f3b88063cdfdde2f9a5b907002ffc898f656ec33f43a8fa9bbc9cb80bff51cdf86baa2fe09c1df22b1ac8b441ec177f86"

RPROVIDES:${PN} += "mokutil"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libefivar.so.1 \
libkeyutils.so.1 \
openssl"

inherit rpm
