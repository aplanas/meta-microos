SUMMARY = "Plugin for libdnf to implement transactional updates"
DESCRIPTION = "This package contains the plugin to implement transactional updates \
as a libdnf plugin. This plugin hooks into the DNF 'context' for \
Micro DNF and PackageKit to enable this functionality in normal use."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libdnf-plugin-txnupd-0.1.3-1.12.aarch64.rpm"
RPM_HASH = "b162244db489b04a919fab516d4a424859969cf44c7d99173d9c5b4c685f0765ef53f8938e7e7bb168fc3d64af6cf9d8f532f9af092152663912c77a3cfae95d"

RPROVIDES:${PN} += "libdnf-plugin-txnupd"

RDEPENDS:${PN} += "dnf-data \
dracut-transactional-update \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtukit.so.4 \
libtukit4"

inherit rpm
