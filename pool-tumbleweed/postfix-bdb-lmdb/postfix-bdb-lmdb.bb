SUMMARY = "Postfix plugin to support LMDB maps"
DESCRIPTION = "Postfix plugin to support LMDB maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
lmdb."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-bdb-lmdb-3.8.0-2.2.aarch64.rpm"
RPM_HASH = "e3d3ac7e487fefc986c43ffb1fd7780591384947f0b94bef9f5754e86854d7775cdfd99fb04f1b79f93a0db8f01153bd61af1fdf0cf2a25afe67ff5add8cef35"

RPROVIDES:${PN} += "postfix-bdb-lmdb \
postfix-bdb-lmdb(aarch-64) \
postfix-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
liblmdb-0.9.30.so()(64bit) \
postfix-bdb"

inherit rpm
