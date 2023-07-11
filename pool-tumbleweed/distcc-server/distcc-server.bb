SUMMARY = "Server for distributed C/C++ compilation"
DESCRIPTION = "This package contains the compilation server needed to use distcc."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-server-3.4-5.5.aarch64.rpm"
RPM_HASH = "2c2370ec80cd43d77e564c5a6719f791e341bca176afbf3c12a25521b6f99e971b460966cffc7e8e45db22926084b534003d6c44c5de3df77a58076f2a29531b"

RPROVIDES:${PN} += "config-distcc-server \
distcc-server \
python3.11dist-include-server \
python3dist-include-server"

RDEPENDS:${PN} += "/usr/bin/sh \
distcc \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
systemd"

inherit rpm
