SUMMARY = "Network Link Manager and user applications for it"
DESCRIPTION = "NetworkManager attempts to keep an active network connection available \
at all times.  The point of NetworkManager is to make networking \
configuration and setup as painless and automatic as possible.	If \
using DHCP, NetworkManager is intended to replace default routes, \
obtain IP addresses from a DHCP server, and change name servers \
whenever it sees fit."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "d18bedb438a15f3f549fbb1405aff1c36fa43871aa14f1aab9b328f13bd37d63eb804953b8f9244ce0dba22585e8d091d18926982ab4d80bf30c238381d81828"

RPROVIDES:${PN} += "NetworkManager NetworkManager(aarch-64) NetworkManager-wifi config(NetworkManager) dhcdbd libnm-device-plugin-wifi.so()(64bit) service(network) sysvinit(network)"
RDEPENDS:${PN} += "/bin/bash /bin/sh NetworkManager-branding ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libndp.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_10_0)(64bit) libnm.so.0(libnm_1_10_2)(64bit) libnm.so.0(libnm_1_12_0)(64bit) libnm.so.0(libnm_1_14_0)(64bit) libnm.so.0(libnm_1_16_0)(64bit) libnm.so.0(libnm_1_18_0)(64bit) libnm.so.0(libnm_1_20_0)(64bit) libnm.so.0(libnm_1_22_0)(64bit) libnm.so.0(libnm_1_24_0)(64bit) libnm.so.0(libnm_1_26_0)(64bit) libnm.so.0(libnm_1_28_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnm.so.0(libnm_1_30_0)(64bit) libnm.so.0(libnm_1_34_0)(64bit) libnm.so.0(libnm_1_38_0)(64bit) libnm.so.0(libnm_1_40_0)(64bit) libnm.so.0(libnm_1_42_0)(64bit) libnm.so.0(libnm_1_4_0)(64bit) libnm.so.0(libnm_1_6_0)(64bit) libnm.so.0(libnm_1_8_0)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.2)(64bit) libpsl.so.5()(64bit) libreadline.so.8()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.2)(64bit) libsmime3.so(NSS_3.4)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) mozilla-nss wpa_supplicant"

inherit rpm
