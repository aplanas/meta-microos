SUMMARY = "Utilities for doing and managing mounts of the Linux CIFS filesystem"
DESCRIPTION = "The cifs-utils package consist of utilities for doing and managing mounts of \
the Linux CIFS filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "7.0"

RPM_NAME = "cifs-utils-7.0-2.4.aarch64.rpm"
RPM_HASH = "fb2e5da0136943bb2acbc7acae3aa760c4c3ee4084b8a56e2aee2d36b6b80418356ef580dd44276b2d96559164c15d7334573a514da608099cfa4fde932719cc"

RPROVIDES:${PN} += "cifs-mount \
cifs-utils \
config-cifs-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
