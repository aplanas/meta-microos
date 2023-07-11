SUMMARY = "OS abstraction library for Heimdal Kerberos"
DESCRIPTION = "This package contains a library that wraps or adds utility functions \
missing from certain operating systems."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libroken18-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "1dbcbe241b354e9ea54613ed0533050069dc65cb272516722ba047d4301e377f0cf54541f1b0981ea4baff1e8d884b8adbd0690357a8b689dceb9ef68749d7fd"

RPROVIDES:${PN} += "libroken.so.18 \
libroken18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
