SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecppcmn11-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "898a79a6da1dd91ac866f3e008ab9e627b848ba6efde5e2aba6824ff7ae9b400e5819dc9de556a004167ba5f44959297ce22d9893db55595b53afe5aa6ae7c3f"

RPROVIDES:${PN} += "libframecppcmn.so.11 \
libframecppcmn11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
