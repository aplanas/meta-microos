SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.3_1"

RPM_NAME = "hdjmod-kmp-64kb-1.34_k6.4.3_1-1.12.aarch64.rpm"
RPM_HASH = "8c204c3234021e0914012610bd61f457e809aa2a847922a1602170f3c8df49440fca00945dd7c527d626571b5b8016c343d0bbecbe34b9267c56b00e6fc8a258"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k6.4.3-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
