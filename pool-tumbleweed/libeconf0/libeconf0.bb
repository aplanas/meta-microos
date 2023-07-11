SUMMARY = "Enhanced config file parser ala systemd"
DESCRIPTION = "Enhanced config file parser, which merges config files placed \
in several locations into one."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libeconf0-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "69be05f88370e0bac2516aad56ba576f96536d4a665b5dd512274413a4ca089e2020e0e0c8ed0cd07a48a02520592f67fccffe1442dad26f464981593dae4d3e"

RPROVIDES:${PN} += "libeconf.so.0 \
libeconf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
