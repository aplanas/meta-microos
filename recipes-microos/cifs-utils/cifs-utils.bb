SUMMARY = "Utilities for doing and managing mounts of the Linux CIFS filesystem"
DESCRIPTION = "The cifs-utils package consist of utilities for doing and managing mounts of \
the Linux CIFS filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "7.0"

RPM_NAME = "cifs-utils-7.0-2.3.aarch64.rpm"
RPM_HASH = "1a0f21dbc8ffc29640a1083ad899af611547799327fa70b82c823558fae582002c3a1cdf8c83cf885d06344ddb98392fadcf51898fb93ef442d4a339e9546e9e"

RPROVIDES:${PN} += "cifs-mount \
cifs-utils \
cifs-utils(aarch-64) \
config(cifs-utils)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
keyutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap-ng.so.0()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
libkeyutils.so.1(KEYUTILS_1.0)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libwbclient.so.0()(64bit) \
libwbclient.so.0(WBCLIENT_0.9)(64bit) \
update-alternatives"

inherit rpm
