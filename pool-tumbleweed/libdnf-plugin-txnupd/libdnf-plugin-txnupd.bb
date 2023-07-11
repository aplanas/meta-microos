SUMMARY = "Plugin for libdnf to implement transactional updates"
DESCRIPTION = "This package contains the plugin to implement transactional updates \
as a libdnf plugin. This plugin hooks into the DNF 'context' for \
Micro DNF and PackageKit to enable this functionality in normal use."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libdnf-plugin-txnupd-0.1.3-1.13.aarch64.rpm"
RPM_HASH = "dbc6078d8b22cc77b466d3a7ab7252a34c1b6eb88b1195bc26dc688282498835fbb5c8afb8f239cff15ca74485585fb53643eb3d4e59c97ae382d2cdbaa347ce"

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
