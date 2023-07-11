SUMMARY = "Connection Manager"
DESCRIPTION = "Connection Manager provides a daemon for managing Internet connections \
within embedded devices running the Linux operating system."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-1.41-4.8.aarch64.rpm"
RPM_HASH = "96733dd6ca0e1dfca2da24fc1a100b080cfba4e203a7471a9630a5750e381f3d1139217ace60eb2cfea991e7ca9cf2437c6ec3658d07198f434ae2e1ba7c9512"

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
