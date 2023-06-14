SUMMARY = "Utilities for doing and managing mounts of the Linux CIFS filesystem"
DESCRIPTION = "The cifs-utils package consist of utilities for doing and managing mounts of \
the Linux CIFS filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "7.0"

RPM_NAME = "cifs-utils-7.0-2.3.aarch64.rpm"
RPM_HASH = "1a0f21dbc8ffc29640a1083ad899af611547799327fa70b82c823558fae582002c3a1cdf8c83cf885d06344ddb98392fadcf51898fb93ef442d4a339e9546e9e"

RPROVIDES:${PN} += "cifs-mount \
cifs-utils \
config-cifs-utils"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
keyutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgssapi-krb5.so.2 \
libkeyutils.so.1 \
libkrb5.so.3 \
libtalloc.so.2 \
libwbclient.so.0 \
update-alternatives"

inherit rpm
