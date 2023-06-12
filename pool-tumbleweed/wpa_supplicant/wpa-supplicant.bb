SUMMARY = "WPA supplicant implementation"
DESCRIPTION = "wpa_supplicant is an implementation of the WPA Supplicant component, \
i.e., the part that runs in the client stations. It implements key \
negotiation with a WPA Authenticator and it controls the roaming and \
IEEE 802.11 authentication/association of the wlan driver."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "wpa_supplicant-2.10-5.1.aarch64.rpm"
RPM_HASH = "7dd59f05905163f6f877f2bc582d0a3a0c45606fa32d9249cf77dcd07a8fda2b24be8b13b61e8d3ae55441e459c40fb7d215e407f64debec616ed6158fc29458"

RPROVIDES:${PN} += "config(wpa_supplicant) \
wpa_supplicant \
wpa_supplicant(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200(libnl_3_2_28)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
logrotate"

inherit rpm
