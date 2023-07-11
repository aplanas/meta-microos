SUMMARY = "Dsh plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes from dsh-style 'group' files"
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-dshgroup-2.34-12.1.aarch64.rpm"
RPM_HASH = "337da0c3fe2f011b47cafbe70656fd4ffa2b3e8ca207829a22d4ec0ad2f2d736f05caf2506ef8018d91ba679815dbd31c213ae67798f50df1f24785aab7bff09"

RPROVIDES:${PN} += "pdsh-dshgroup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pdsh"

inherit rpm
