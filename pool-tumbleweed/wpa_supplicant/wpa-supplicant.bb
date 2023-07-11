SUMMARY = "WPA supplicant implementation"
DESCRIPTION = "wpa_supplicant is an implementation of the WPA Supplicant component, \
i.e., the part that runs in the client stations. It implements key \
negotiation with a WPA Authenticator and it controls the roaming and \
IEEE 802.11 authentication/association of the wlan driver."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "wpa_supplicant-2.10-5.2.aarch64.rpm"
RPM_HASH = "7eb5fa5cf3493d1f6a237ea85d1a5b083df7606d947e520279e4cc261ee260a4dbf29760571b34e079139944c9ca36cbbcf5281622185d40fd1c771f61857b98"

RPROVIDES:${PN} += "config-wpa-supplicant \
wpa-supplicant"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libssl.so.3 \
logrotate"

inherit rpm
