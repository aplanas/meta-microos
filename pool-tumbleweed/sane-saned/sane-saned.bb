SUMMARY = "Sane network server"
DESCRIPTION = "Saned allows access to locally attached scanners over the network."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "sane-saned-1.2.1-1.2.aarch64.rpm"
RPM_HASH = "7b929c704c99805f363e921b24c083493e98425dd11601d7a5c357df52a243ce5c3b681523f64925a2378c9b3effe6923de1fdb494e66609b998bac41b1198fe"

RPROVIDES:${PN} += "config-sane-saned \
sane-backends-/usr/sbin/saned \
sane-saned"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libsane.so.1"

inherit rpm
