SUMMARY = "C++ SyncML Client Engine"
DESCRIPTION = "Libfunambol allows to integrate a SyncML stack in a C++ application on a \
variety of platforms. Currently, Windows, Windows Mobile and Linux, Mac OS X, \
iPhone and Symbian are actively supported, but you can easily build it on other \
Unixes or other mobile/embedded platforms."
LICENSE = "AGPL-3.0"

PV = "9.0.1"

RPM_NAME = "libfunambol-9_0_1-9.0.1-16.24.aarch64.rpm"
RPM_HASH = "3160f228a47507bc24b89b5802b87a35f91d5e8726a3a1048bb9853bf7fe3522476ec33cf08118efa52f830b58c940a08d86de11f70e45b0877cd89f28837b57"

RPROVIDES:${PN} += "libfunambol-9-0-1 \
libfunambol-9.0.1.so \
libfunambol9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
