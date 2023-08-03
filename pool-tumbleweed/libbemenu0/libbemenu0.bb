SUMMARY = "Dynamic menu library inspired by dmenu"
DESCRIPTION = "Library for Bemenu, dynamic menu inspired by dmenu."
LICENSE = "MIT"

PV = "0.6.15"

RPM_NAME = "libbemenu0-0.6.15-1.2.aarch64.rpm"
RPM_HASH = "ab7a8f11ab6a9b6d5e73750a8e0ee6747b5131a3768844866d7f33506e6c69e0426b73af83a6801a2880942d6863bfb95f037b778170255cfbe2c9c8923e28e7"

RPROVIDES:${PN} += "libbemenu.so.0 \
libbemenu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
bemenu \
libc.so.6"

inherit rpm
