SUMMARY = "CompizConfig plugin required for CCSM"
DESCRIPTION = "CompizConfig plugin required for compizconfig-settings-manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "libcompizconfig-0.8.18-2.11.aarch64.rpm"
RPM_HASH = "39e31fcabebdff9332c1b79dc2e901fbcbd87af921bb025a8f7952f6cafc0a6b238c2fde815404143f0018cf4180a95a64f67b5ff67515572149f3f01c0c1599"

RPROVIDES:${PN} += "config-libcompizconfig \
libccp.so \
libcompizconfig \
libcompizconfig.so.0 \
libini.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
compiz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
