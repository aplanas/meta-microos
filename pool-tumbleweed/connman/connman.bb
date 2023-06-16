SUMMARY = "Connection Manager"
DESCRIPTION = "Connection Manager provides a daemon for managing Internet connections \
within embedded devices running the Linux operating system."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-1.41-4.7.aarch64.rpm"
RPM_HASH = "0d0c471d20fe8b4cd5696ec20bc476a6c922e0e5e3436fab3ae2043fb80fb2b105870b73b10670a1e378056d8a091795e2cad0e7c6b50623e7d3579372ca036e"

RPROVIDES:${PN} += "config-connman \
connman"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
dhcp \
iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libmnl.so.0 \
libnftnl.so.11 \
libresolv.so.2 \
systemd \
wpa-supplicant"

inherit rpm
